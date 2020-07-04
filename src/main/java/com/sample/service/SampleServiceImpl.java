package com.sample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sample.dao.SampleDao;
import com.sample.modal.Color;

@Service
public class SampleServiceImpl implements SampleService {

  @Autowired
  private SampleDao sampleDao;

  @Override
  public List<Color> getColors() {
    return sampleDao.getColors();
  }
}
