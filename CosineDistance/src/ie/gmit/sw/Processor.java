package ie.gmit.sw;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.BlockingQueue;

public class Processor {
  BlockingQueue<Word> queue;
  File[] files;
  File query;
  
  public Processor(BlockingQueue<Word> queue) {
    this.queue = queue;
  }

  public void processFiles(String queryFile, String subjectFiles) {
    
    files = new File(subjectFiles).listFiles(new FilenameFilter() {
      public boolean accept(File current, String name) {
        return new File(current, name).isFile();
      }
    });
    
    query = new File(queryFile);
    
    new Thread(new FileParser(queue, query), "queryThread").start();

    for(File f : files) {
      new Thread(new FileParser(queue, f)).start();
    }
  }
  
  public int getFileCount() {
    return files.length + 1;
  }
  
  public File[] getFiles() {
    return files;
  }
}
