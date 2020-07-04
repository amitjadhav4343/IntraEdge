package com.sample.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.sample.modal.Color;

@Repository
public class SampleDaoImpl implements SampleDao {

  @Override
  public List<Color> getColors() {
    List<Color> list = new ArrayList<>();
    list.add(new Color("Black", "(0,0,0)"));
    list.add(new Color("White", "(255,255,255)"));
    list.add(new Color("Red", "(255,0,0)"));
    list.add(new Color("Lime", "(0,255,0)"));
    list.add(new Color("Blue", "(0,0,255)"));
    list.add(new Color("Yellow", "(255,255,0)"));
    list.add(new Color("Cyan/Aqua", "(0,255,255)"));
    list.add(new Color("Magenta/Fuchsia", "(255,0,255)"));
    list.add(new Color("Maroon", "(128,0,0)"));
    list.add(new Color("Olive", "(128,128,0)"));
    list.add(new Color("Green", "(0,128,0)"));
    list.add(new Color("Purple", "(128,0,128)"));
    list.add(new Color("Teal", "(0,128,128)"));
    list.add(new Color("Navy", "(0,0,128)"));
    return list;
  }
}
