package Kermis;

interface GokAttractie{
    void belastbaar();
    default void proberen() {
        System.out.println("default gedrag");
    }
    static void proberen2() {
        System.out.println("static gedrag");
    }
}
