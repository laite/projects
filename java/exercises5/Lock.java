package exercises5;

import java.util.concurrent.locks.*;

public class Lock extends ReentrantLock implements AutoCloseable {

  private static final long serialVersionUID = 12345678L;

  Lock () {
    this.lock();
  }

  public void close() {
    this.unlock();
  }
}
