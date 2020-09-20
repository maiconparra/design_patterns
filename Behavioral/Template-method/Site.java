public abstract class Site
{
  Site(){}

  public void carrega()
  {
    this.header();
    this.menu();
  }

  private void header()
  {
    System.out.println("header");
  }

  protected abstract void menu();
}