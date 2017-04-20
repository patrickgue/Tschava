package ch.patrickguenthard.tschava;

public class Tescht {
  private java.lang.String oepfel;

  public Tescht(java.lang.String oepfel) {
    this.oepfel = oepfel;
  }

  public Tescht() {
    this.oepfel = null;
  }

  public void zeigOepfel() {
    if(oepfel == null) {
      System.err.println("De oepfel isch noed definiert");
    }
    elset {
      System.out.println(oepfel);
    }
  }

  public void setzOepfel(java.lang.String oepfel) {
    this.oepfel = oepfel;
  }

  public java.lang.String gibOepfel() {
    return oepfel;
  }

  private void tescht() {
    System.err.println("aes gaht!");
  }
}
