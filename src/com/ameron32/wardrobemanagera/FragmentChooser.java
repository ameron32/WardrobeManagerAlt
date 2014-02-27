package com.ameron32.wardrobemanagera;

import android.support.v4.app.Fragment;

public class FragmentChooser {
 
  static Fragment getFragmentByPosition(int position) {
    switch (position) {
    case 0:
      return new BasicsFragment();
    case 1:
      return new TagsFragment();
    
    default:
      return new BasicsFragment();
    }
  }
}
