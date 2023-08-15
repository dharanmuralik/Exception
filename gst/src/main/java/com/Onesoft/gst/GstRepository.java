package com.Onesoft.gst;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GstRepository extends JpaRepository<Gst, Integer> {

	
	@Query(value="select percentage from gst_details where hsncode=?",nativeQuery = true)
	Integer getPerByHsn(int hsn);
}
