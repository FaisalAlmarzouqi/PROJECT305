import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 52);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (-1L));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        int int13 = product3.getId();
        double double14 = product3.getPrice();
        int int15 = product3.getId();
        java.lang.Class<?> wildcardClass16 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (byte) -1);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (short) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        double double13 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("");
        java.util.List<model.Product> productList44 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
        org.junit.Assert.assertNotNull(productList44);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 35);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        int int11 = product3.getId();
        java.lang.String str12 = product3.getName();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        int int16 = product3.getId();
        double double17 = product3.getPrice();
        int int18 = product3.getId();
        int int19 = product3.getId();
        int int20 = product3.getId();
        int int21 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        model.Product product3 = new model.Product(10, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        model.Product product3 = new model.Product(10, "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 32);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("");
        java.util.List<model.Product> productList44 = searchService0.searchProducts("");
        java.util.List<model.Product> productList46 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass47 = productList46.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
        org.junit.Assert.assertNotNull(productList44);
        org.junit.Assert.assertNotNull(productList46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        model.Product product3 = new model.Product((int) (short) 1, "", 10.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1L));
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1L));
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass31 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        model.Product product3 = new model.Product(52, "hi!", (double) 35);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (-1.0d));
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        model.Product product3 = new model.Product((int) (short) -1, "", (-1.0d));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) ' ');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        model.Product product3 = new model.Product((int) 'a', "", 0.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        model.Product product3 = new model.Product((int) (byte) 1, "", 100.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass33 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        model.Product product3 = new model.Product(0, "", (double) 1L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 0.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) (short) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        model.Product product3 = new model.Product(52, "hi!", (double) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        model.Product product3 = new model.Product(32, "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) ' ');
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        model.Product product3 = new model.Product(100, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        java.lang.String str14 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        model.Product product3 = new model.Product(32, "hi!", 0.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) (byte) -1);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 10);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 100L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        model.Product product3 = new model.Product(32, "hi!", (double) (short) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass23 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        model.Product product3 = new model.Product(0, "", (double) (byte) 10);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 10L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        model.Product product3 = new model.Product((int) (byte) 0, "", 100.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        double double14 = product3.getPrice();
        java.lang.String str15 = product3.getName();
        java.lang.String str16 = product3.getName();
        double double17 = product3.getPrice();
        java.lang.String str18 = product3.getName();
        double double19 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        java.lang.String str12 = product3.getName();
        java.lang.String str13 = product3.getName();
        java.lang.String str14 = product3.getName();
        int int15 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        model.Product product3 = new model.Product(1, "hi!", (double) 100.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass37 = productList36.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        model.Product product3 = new model.Product(0, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (byte) 100);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        model.Product product3 = new model.Product(32, "hi!", 100.0d);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass31 = productList30.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        model.Product product3 = new model.Product((int) 'a', "", 10.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 35);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        model.Product product3 = new model.Product((int) (short) 1, "", 97.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        model.Product product3 = new model.Product((-1), "", (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass29 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (short) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass19 = productList18.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        model.Product product3 = new model.Product(10, "hi!", (double) 10.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1));
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        int int14 = product3.getId();
        int int15 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 0L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        model.Product product3 = new model.Product(52, "", (double) 'a');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 52);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        model.Product product3 = new model.Product(97, "", (double) 97);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        model.Product product3 = new model.Product(10, "hi!", (double) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        model.Product product3 = new model.Product(10, "hi!", (double) 32);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 100L);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        model.Product product3 = new model.Product((int) '#', "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) 100L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        java.lang.String str14 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        model.Product product3 = new model.Product(0, "", (double) ' ');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100L);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass17 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass33 = productList32.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        model.Product product3 = new model.Product(10, "", (double) 1);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        model.Product product3 = new model.Product((int) 'a', "", (double) ' ');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass21 = productList20.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        model.Product product3 = new model.Product(0, "hi!", (double) 35);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        model.Product product3 = new model.Product(97, "", (double) (short) 10);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        model.Product product3 = new model.Product(0, "", 35.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        model.Product product3 = new model.Product((int) ' ', "", (double) 1.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        model.Product product3 = new model.Product(1, "", (double) (short) 10);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        model.Product product3 = new model.Product((int) 'a', "", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass33 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        model.Product product3 = new model.Product((-1), "hi!", 35.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        model.Product product3 = new model.Product((int) '#', "", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        model.Product product3 = new model.Product(32, "", (double) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) ' ');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        model.Product product3 = new model.Product(10, "", (double) (byte) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        model.Product product3 = new model.Product((int) ' ', "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (short) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass23 = productList22.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        model.Product product3 = new model.Product(0, "", (double) (short) 1);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        model.Product product3 = new model.Product((-1), "", (double) 97);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        model.Product product3 = new model.Product(1, "", (double) (byte) 10);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass25 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) (short) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 97.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        model.Product product3 = new model.Product(10, "", (double) 10L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        model.Product product3 = new model.Product((int) 'a', "", (double) ' ');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        model.Product product3 = new model.Product((int) '#', "", 52.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList44 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList46 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass47 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
        org.junit.Assert.assertNotNull(productList44);
        org.junit.Assert.assertNotNull(productList46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 97);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        java.lang.Class<?> wildcardClass15 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        double double13 = product3.getPrice();
        java.lang.String str14 = product3.getName();
        double double15 = product3.getPrice();
        int int16 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        model.Product product3 = new model.Product(10, "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("");
        java.util.List<model.Product> productList44 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
        org.junit.Assert.assertNotNull(productList44);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) 35);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        model.Product product3 = new model.Product(0, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        model.Product product3 = new model.Product(97, "", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) ' ');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        model.Product product3 = new model.Product(35, "hi!", (double) (short) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        java.lang.String str13 = product3.getName();
        int int14 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        java.lang.String str16 = product3.getName();
        double double17 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass17 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        java.lang.String str13 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 97);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        double double14 = product3.getPrice();
        java.lang.String str15 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        model.Product product3 = new model.Product(100, "hi!", 100.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        model.Product product3 = new model.Product(10, "hi!", (double) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        model.Product product3 = new model.Product((int) (byte) -1, "", 52.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        double double14 = product3.getPrice();
        java.lang.String str15 = product3.getName();
        double double16 = product3.getPrice();
        double double17 = product3.getPrice();
        java.lang.String str18 = product3.getName();
        int int19 = product3.getId();
        int int20 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        model.Product product3 = new model.Product(1, "", (double) (short) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        model.Product product3 = new model.Product(10, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 0.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        model.Product product3 = new model.Product(35, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 52.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (byte) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        model.Product product3 = new model.Product((int) (byte) -1, "", 0.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 10.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        double double14 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        model.Product product3 = new model.Product((int) (short) 10, "", 10.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        model.Product product3 = new model.Product((int) ' ', "", 97.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        model.Product product3 = new model.Product((int) 'a', "", (double) 1.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        model.Product product3 = new model.Product((int) 'a', "", (double) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass17 = productList16.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        model.Product product3 = new model.Product(0, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        model.Product product3 = new model.Product(1, "hi!", (double) (short) -1);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        data.ProductRepository productRepository0 = new data.ProductRepository();
        java.util.List<model.Product> productList1 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList2 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList3 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList4 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList5 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList6 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList7 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList8 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList9 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList10 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList11 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList12 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList13 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList14 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList15 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList16 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList17 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList18 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList19 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList20 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList21 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList22 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList23 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList24 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList25 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList26 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList27 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList28 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList29 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList30 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList31 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList32 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList33 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList34 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList35 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList36 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList37 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList38 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList39 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList40 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList41 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList42 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList43 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList44 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList45 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList46 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList47 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList48 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList49 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList50 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList51 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList52 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList53 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList54 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList55 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList56 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList57 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList58 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList59 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList60 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList61 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList62 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList63 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList64 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList65 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList66 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList67 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList68 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList69 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList70 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList71 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList72 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList73 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList74 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList75 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList76 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList77 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList78 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList79 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList80 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList81 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList82 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList83 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList84 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList85 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList86 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList87 = productRepository0.getAllProducts();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList23);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList27);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList29);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList31);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList33);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList35);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList37);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList39);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList41);
        org.junit.Assert.assertNotNull(productList42);
        org.junit.Assert.assertNotNull(productList43);
        org.junit.Assert.assertNotNull(productList44);
        org.junit.Assert.assertNotNull(productList45);
        org.junit.Assert.assertNotNull(productList46);
        org.junit.Assert.assertNotNull(productList47);
        org.junit.Assert.assertNotNull(productList48);
        org.junit.Assert.assertNotNull(productList49);
        org.junit.Assert.assertNotNull(productList50);
        org.junit.Assert.assertNotNull(productList51);
        org.junit.Assert.assertNotNull(productList52);
        org.junit.Assert.assertNotNull(productList53);
        org.junit.Assert.assertNotNull(productList54);
        org.junit.Assert.assertNotNull(productList55);
        org.junit.Assert.assertNotNull(productList56);
        org.junit.Assert.assertNotNull(productList57);
        org.junit.Assert.assertNotNull(productList58);
        org.junit.Assert.assertNotNull(productList59);
        org.junit.Assert.assertNotNull(productList60);
        org.junit.Assert.assertNotNull(productList61);
        org.junit.Assert.assertNotNull(productList62);
        org.junit.Assert.assertNotNull(productList63);
        org.junit.Assert.assertNotNull(productList64);
        org.junit.Assert.assertNotNull(productList65);
        org.junit.Assert.assertNotNull(productList66);
        org.junit.Assert.assertNotNull(productList67);
        org.junit.Assert.assertNotNull(productList68);
        org.junit.Assert.assertNotNull(productList69);
        org.junit.Assert.assertNotNull(productList70);
        org.junit.Assert.assertNotNull(productList71);
        org.junit.Assert.assertNotNull(productList72);
        org.junit.Assert.assertNotNull(productList73);
        org.junit.Assert.assertNotNull(productList74);
        org.junit.Assert.assertNotNull(productList75);
        org.junit.Assert.assertNotNull(productList76);
        org.junit.Assert.assertNotNull(productList77);
        org.junit.Assert.assertNotNull(productList78);
        org.junit.Assert.assertNotNull(productList79);
        org.junit.Assert.assertNotNull(productList80);
        org.junit.Assert.assertNotNull(productList81);
        org.junit.Assert.assertNotNull(productList82);
        org.junit.Assert.assertNotNull(productList83);
        org.junit.Assert.assertNotNull(productList84);
        org.junit.Assert.assertNotNull(productList85);
        org.junit.Assert.assertNotNull(productList86);
        org.junit.Assert.assertNotNull(productList87);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
        org.junit.Assert.assertNotNull(productList42);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 97);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        java.lang.String str13 = product3.getName();
        java.lang.Class<?> wildcardClass14 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 1.0d);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        model.Product product3 = new model.Product(35, "hi!", 10.0d);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 100.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        model.Product product3 = new model.Product(100, "", (double) 10L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) '4');
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass27 = productList26.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
        org.junit.Assert.assertNotNull(productList30);
        org.junit.Assert.assertNotNull(productList32);
        org.junit.Assert.assertNotNull(productList34);
        org.junit.Assert.assertNotNull(productList36);
        org.junit.Assert.assertNotNull(productList38);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

