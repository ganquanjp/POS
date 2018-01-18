package jp.co.nsd.nkssweb.service;

import java.util.List;

import jp.co.nsd.nkssweb.repository.Sample;

public interface SampleService {

	Sample selectByPrimaryKey(String userId);

	List<Sample> selectAll();

	List<Sample> selectByWhere(Sample sample);
}
