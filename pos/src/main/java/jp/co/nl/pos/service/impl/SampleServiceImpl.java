package jp.co.nsd.nkssweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.nsd.nkssweb.repository.Sample;
import jp.co.nsd.nkssweb.repository.mapper.SampleMapper;
import jp.co.nsd.nkssweb.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleMapper sampleMapper;

    public Sample selectByPrimaryKey(String userId) {
        return sampleMapper.selectByPrimaryKey(userId);
    }

    public List<Sample> selectAll() {
        return sampleMapper.selectAll();
    }

    public List<Sample> selectByWhere(Sample sample) {
        return sampleMapper.selectByWhere(sample);
    }

}
