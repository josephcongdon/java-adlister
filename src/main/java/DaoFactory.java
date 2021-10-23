import dao.Config;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLadsDao(new Config());
        }
        return adsDao;
    }
}
