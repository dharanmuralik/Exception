package com.Onesoft.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {

	@Autowired
	GstRepository gstrepo;
	
	public List<Gst> getAll()
	{
		return gstrepo.findAll();
	}
	
	public int getPerByHsn( int hsn)
	{
		return gstrepo.getPerByHsn(hsn);
	}
}
