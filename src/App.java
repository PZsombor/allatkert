public class App {
    public static void main(String[] args) throws Exception {

        Maci maci = new Maci();
        Macska mici = new Macska();

        maci.hangotad("xdxd");
        maci.mezgyujtes();
        maci.nev = "Maci";

        mici.hangotad("kurva");
        mici.dorombol();
        mici.nev = "Mici";

        mici.beallitNev("");
        System.out.println(mici.nev);
    }
}
