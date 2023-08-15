package com.Onesoft.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GstController {
	
	@Autowired
	GstService gerSer;
	
	@GetMapping(value="/findAllGst")
	
	public List<Gst> getAll()
	{
		return gerSer.getAll();
	}
	
	
	@GetMapping(value="/getPercentageByhsn/{hsn}")
	
	public Integer getPerByHsn(@PathVariable int hsn)
	{
		return gerSer.getPerByHsn(hsn);
	}

}
