package ie.gmit.sw;

public class Index {
  private int frequency;
  private String fileName;

  public Index(int frequency, String fileName) {
    super();
    this.frequency = frequency;
    this.fileName = fileName;
  }

  public int getFrequency() {
    return frequency;
  }
  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  
  public String toString() {
    return frequency + " File: " + fileName;
  }

}
