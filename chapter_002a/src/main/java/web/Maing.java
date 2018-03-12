package web;

import org.apache.log4j.BasicConfigurator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Maing {
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Maing.class.getName());
    static final String LOG_PROPERTIES_FILE = "log4j.properties";
    public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    public static final Locale LOCALE_HUNGARIAN = new Locale("hu", "HU");
    public static final TimeZone LOCAL_TIME_ZONE = TimeZone.getTimeZone("Europe/Budapest");

    public static void main(String... args) throws IOException,ParseException {
        DateFormatSymbols months = new DateFormatSymbols() {
            @Override
            public String[] getMonths() {
                return new String[]{"янв", "фев", "MARCH", "APRIL", "MAY", "JUNE",
                        "JULY", "AUGUST", "сен", "октя", "NOVEMBER", "дек"};
            }
        };
        Calendar calendar = new GregorianCalendar();
        //dkfj

        org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Maing.class);
        HashSet<String> hashKeys = new HashSet<>();
        final String w = "Java Script";
        final String w2 = "JavaScript";
        final String w1 = "Java";
        final String w3 = "java";

        HashSet<String> hashKeysForUrl = new HashSet<>();
        HashSet<String> hashtext = new HashSet<>();
        final String url = "jdbc:postgresql://localhost:5432/Test";
        final String user = "postgres";
        final String password = "password";

        int i = 1;
        ScheduledExecutorService ses =
                Executors.newScheduledThreadPool(1);
        Runnable pinger = new Runnable() {
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yy, hh:mm", months);

                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                try {
                    String oldDateString = "01 янв 2018, 00:01";
                    Date d = sdf.parse(oldDateString);

                    int j = 1;
                    conn = DriverManager.getConnection(url, user, password);
                    stmt = conn.createStatement();
                    DatabaseMetaData md = conn.getMetaData();
                    rs = stmt.executeQuery("select *from vacancys");
                    if (!rs.next()) {
                        System.out.println("ТАблица пуста");
                        for (int k = 2; k < 8; k++) {

                            Document doc = Jsoup.connect("http://www.sql.ru/forum/job-offers/" + k).get();
                            Elements element12 = doc.getElementsByAttributeValue("class", "altCol");
                            String string11 = element12.get(j).text();
                            String tod = string11.replaceAll("сегодня || вчера", sdf.format(calendar.getTime()));
                            Date dsteOfPars = new SimpleDateFormat("dd MMMM yy, hh:mm", months).parse(tod);
                            j = j + 2;

                            Elements trElements = doc.getElementsByAttributeValue("class", "forumTable");
                            Elements element1 = doc.getElementsByAttributeValue("class", "postslisttopic");
                            for (Element elements : element1) {

                                Elements aelemet = elements.getElementsByAttribute("href");
                                Elements tds1 = element1.select("td");
                                String text = aelemet.get(0).text();
                                String url1 = aelemet.attr("href");
                                hashKeysForUrl.add(url1);
                                hashKeys.add(text);
                                hashKeys.add(text);

                                Elements tds111 = element12.select("td");
//
                                PreparedStatement st = conn.prepareStatement("INSERT into vacancys( java_vacancys, URL) VALUES (?,?)");
                                if (d.before(dsteOfPars)) {
                                    if ((text.matches(".*\\b" + w1 + "\\b.*") || text.matches(".*\\b" + w3 + "\\b.*")) && (!text.matches(".*\\b" + w + "\\b.*") && !text.matches(".*\\b" + w2 + "\\b.*"))) {
                                        st.setString(1, text);
                                        st.setString(2, url1);
                                        int rowsDeleted = st.executeUpdate();
                                    }

                                }
                            }


                        }

                    } else {
                        System.out.println("данные есть в таблицу");
                        Document doc = Jsoup.connect("http://www.sql.ru/forum/job-offers").get();
                        Elements element1 = doc.getElementsByAttributeValue("class", "postslisttopic");
                        for (Element elements : element1) {
                            Elements aelemet = elements.getElementsByAttribute("href");
                            Elements tds1 = element1.select("td");
                            String text = aelemet.get(0).text();
                            String url1 = aelemet.attr("href");
                            hashKeysForUrl.add(url1);
                            hashKeys.add(text);
                            hashKeys.add(text);
                            String ne = "new";
                            PreparedStatement st = conn.prepareStatement("INSERT into vacancys( java_vacancys, URL) VALUES (?,?)");
                            //   if (!hashKeys.contains(text)) {
                            if ((text.matches(".*\\b" + w1 + "\\b.*") || text.matches(".*\\b" + w3 + "\\b.*")) && (!text.matches(".*\\b" + w + "\\b.*") && !text.matches(".*\\b" + w2 + "\\b.*"))) {
                                st.setString(1, text);
                                st.setString(2, url1);
                                int rowsDeleted = st.executeUpdate();
                            } else {
                                System.out.println("данная вакансия ужедобавленна");
                            }
                        }

                        System.out.println("lj,fdbkj");


                    }


                } catch (Exception e) {
                    LOGGER.error(e.getMessage(), e);

                } finally {
                    if (conn != null) {
                        try {
                            conn.close();
                        } catch (SQLException ex) {
                            LOGGER.error(ex.getMessage(), ex);
                        }

                    }
                }
            }


        };

        ses.scheduleAtFixedRate(pinger, 8,  24*60*60, TimeUnit.SECONDS);

    }
}




