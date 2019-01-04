package ie.gmit.sw;

public class Word {
  private String fileName;
  private String shingle;

  public Word(String fileName, String shingle) {
    super();
    this.fileName = fileName;
    this.shingle = shingle;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getShingle() {
    return shingle;
  }

  public void setShingle(String shingle) {
    this.shingle = shingle;
  }
}
