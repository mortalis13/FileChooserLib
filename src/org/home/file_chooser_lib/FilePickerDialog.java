package org.home.file_chooser_lib;

import java.util.stream.Stream;

import android.content.Context;


public class FilePickerDialog extends PickerDialog {
  
  public FilePickerDialog(Context context) {
    super(context, true);
  }
  
  
  public void setExtensionFilter(String[] exts) {
    fileFilter = (file) -> {
      boolean hasExtenstion = Stream.of(exts).anyMatch(ext -> file.getName().toLowerCase().endsWith(ext));
      return file.isFile() && hasExtenstion;
    };
  }
  
  public void setExtensionFilter(String ext) {
    fileFilter = (file) -> {
      return file.isFile() && file.getName().toLowerCase().endsWith(ext);
    };
  }
  
}
