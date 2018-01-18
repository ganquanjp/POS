package jp.co.nsd.nkssweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.co.nsd.nkssweb.repository.Sample;
import jp.co.nsd.nkssweb.service.SampleService;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/sample-selectOne", method = RequestMethod.GET)
    public Sample selectOne(@RequestParam(value = "userId", required = true) String userId) {
    	System.out.println("ganquan test 1");
        return sampleService.selectByPrimaryKey(userId);
    }

    @RequestMapping(value = "/sample-selectAll", method = RequestMethod.GET)
    public List<Sample> selectAll() {
        return sampleService.selectAll();
    }

    @RequestMapping(value = "/sample-selectByWhere", method = RequestMethod.GET)
    public List<Sample> selectByWhere() {

    	Sample sample = new Sample();

    	sample.setUserId("0001");
    	sample.setUserName("甘");

        return sampleService.selectByWhere(sample);
    }
}
