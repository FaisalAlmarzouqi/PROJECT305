import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '#');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 0L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        model.Product product3 = new model.Product((int) 'a', "", (double) 1L);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 100.0d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (short) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        model.Product product3 = new model.Product(35, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
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
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        model.Product product3 = new model.Product(100, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        model.Product product3 = new model.Product(97, "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        model.Product product3 = new model.Product(97, "", 100.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass11 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
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
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        model.Product product3 = new model.Product((int) (short) 1, "", 10.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        java.lang.String str13 = product3.getName();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        model.Product product3 = new model.Product(35, "", (double) ' ');
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        double double13 = product3.getPrice();
        int int14 = product3.getId();
        double double15 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        model.Product product3 = new model.Product((-1), "hi!", (double) 10L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        model.Product product3 = new model.Product(1, "", (double) (short) 100);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        model.Product product3 = new model.Product((int) (short) 10, "", 100.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 0.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        java.lang.Class<?> wildcardClass35 = productList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) ' ');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        model.Product product3 = new model.Product(10, "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (byte) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        model.Product product3 = new model.Product((int) ' ', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        model.Product product3 = new model.Product(1, "", (double) 10L);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        model.Product product3 = new model.Product((-1), "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("hi!");
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
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        model.Product product3 = new model.Product(35, "", (double) (-1L));
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        model.Product product3 = new model.Product(100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        int int15 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        model.Product product3 = new model.Product(0, "hi!", 100.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        model.Product product3 = new model.Product(0, "", 10.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
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
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        model.Product product3 = new model.Product(100, "hi!", (double) (byte) 1);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (short) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (-1.0f));
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass21 = searchService0.getClass();
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
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) 10);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        model.Product product3 = new model.Product(1, "hi!", (double) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        model.Product product3 = new model.Product(100, "hi!", (double) 32);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass25 = productList24.getClass();
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
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        model.Product product3 = new model.Product(35, "hi!", (double) 1L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
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
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        model.Product product3 = new model.Product(52, "", (double) (short) 0);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        model.Product product3 = new model.Product((int) ' ', "", (double) (-1.0f));
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        model.Product product3 = new model.Product(0, "", (double) '4');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 52.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass9 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        model.Product product3 = new model.Product(1, "", 1.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        int int14 = product3.getId();
        int int15 = product3.getId();
        double double16 = product3.getPrice();
        java.lang.String str17 = product3.getName();
        int int18 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        model.Product product3 = new model.Product(1, "hi!", (double) 10L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        model.Product product3 = new model.Product(100, "", (double) (short) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 10L);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        model.Product product3 = new model.Product((int) '4', "", (double) (short) 100);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        model.Product product3 = new model.Product(1, "", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        model.Product product3 = new model.Product(97, "", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        model.Product product3 = new model.Product(100, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 0.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        model.Product product3 = new model.Product(0, "", (double) (-1));
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        model.Product product3 = new model.Product(35, "hi!", (double) (-1L));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        model.Product product3 = new model.Product(1, "", (double) (byte) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) 100);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        model.Product product3 = new model.Product((int) '4', "", (double) 0L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        java.lang.Class<?> wildcardClass31 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 35);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
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
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 10);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 0);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        double double14 = product3.getPrice();
        double double15 = product3.getPrice();
        int int16 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        java.lang.String str16 = product3.getName();
        double double17 = product3.getPrice();
        double double18 = product3.getPrice();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        model.Product product3 = new model.Product(97, "", (double) (byte) 10);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        model.Product product3 = new model.Product(97, "hi!", (double) 10);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) ' ');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 32);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        model.Product product3 = new model.Product((-1), "", (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        model.Product product3 = new model.Product(1, "", (double) 'a');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
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
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        model.Product product3 = new model.Product(52, "", 100.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        java.lang.Class<?> wildcardClass14 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        model.Product product3 = new model.Product((int) '4', "", (double) 1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        model.Product product3 = new model.Product((int) (short) 0, "", 97.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        model.Product product3 = new model.Product((int) '4', "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        model.Product product3 = new model.Product(35, "", (double) 10L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) ' ');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        model.Product product3 = new model.Product((int) '4', "", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        model.Product product3 = new model.Product((int) (short) 1, "", 100.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 100L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) '4');
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        model.Product product3 = new model.Product(0, "hi!", (double) 0L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        model.Product product3 = new model.Product(0, "", 35.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        model.Product product3 = new model.Product((int) (short) 0, "", 97.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        double double18 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        int int17 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        int int11 = product3.getId();
        int int12 = product3.getId();
        int int13 = product3.getId();
        double double14 = product3.getPrice();
        int int15 = product3.getId();
        int int16 = product3.getId();
        int int17 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        model.Product product3 = new model.Product((-1), "", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) (byte) 10);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        model.Product product3 = new model.Product(97, "hi!", (double) ' ');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        model.Product product3 = new model.Product(97, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 100.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 10.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) (-1L));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        model.Product product3 = new model.Product(0, "", (double) (short) 100);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (-1));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) ' ');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass35 = productList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
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
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
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
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        java.lang.String str13 = product3.getName();
        int int14 = product3.getId();
        int int15 = product3.getId();
        int int16 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        model.Product product3 = new model.Product(0, "hi!", (double) 1L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 35.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        model.Product product3 = new model.Product(1, "", (double) (byte) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        java.lang.String str13 = product3.getName();
        java.lang.String str14 = product3.getName();
        int int15 = product3.getId();
        double double16 = product3.getPrice();
        double double17 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 100.0f);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (short) -1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        model.Product product3 = new model.Product((-1), "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) (byte) 100);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        model.Product product3 = new model.Product(97, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) 32);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (byte) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        int int11 = product3.getId();
        int int12 = product3.getId();
        int int13 = product3.getId();
        int int14 = product3.getId();
        java.lang.String str15 = product3.getName();
        java.lang.Class<?> wildcardClass16 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) 1L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass37 = searchService0.getClass();
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
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList44 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList46 = searchService0.searchProducts("");
        java.util.List<model.Product> productList48 = searchService0.searchProducts("");
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
        org.junit.Assert.assertNotNull(productList48);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        model.Product product3 = new model.Product((int) '4', "", 35.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        model.Product product3 = new model.Product(100, "hi!", (double) 35);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass13 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 32);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        double double13 = product3.getPrice();
        int int14 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        model.Product product3 = new model.Product(100, "", (double) 0.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 100.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        model.Product product3 = new model.Product(52, "", (double) 'a');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        model.Product product3 = new model.Product(32, "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        double double13 = product3.getPrice();
        java.lang.String str14 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
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
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        int int12 = product3.getId();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        java.lang.Class<?> wildcardClass65 = productList64.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '#');
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        model.Product product3 = new model.Product(0, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
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
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
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
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", 32.0d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
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
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) '#');
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        model.Product product3 = new model.Product((int) 'a', "", (double) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
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
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 10);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        model.Product product3 = new model.Product(97, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) -1);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        int int11 = product3.getId();
        int int12 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        model.Product product3 = new model.Product(32, "hi!", (double) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        model.Product product3 = new model.Product(97, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
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
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        model.Product product3 = new model.Product((int) ' ', "", (double) '#');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
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
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass21 = searchService0.getClass();
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
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 35);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        model.Product product3 = new model.Product(10, "hi!", (double) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        model.Product product3 = new model.Product((-1), "", (double) (short) 10);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        model.Product product3 = new model.Product((int) (byte) 100, "", 1.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        model.Product product3 = new model.Product((int) '4', "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        model.Product product3 = new model.Product(100, "", (double) 10L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        model.Product product3 = new model.Product(97, "hi!", (double) 10L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        model.Product product3 = new model.Product(35, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        java.lang.Class<?> wildcardClass21 = searchService0.getClass();
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
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        int int12 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
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
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        model.Product product3 = new model.Product(100, "", 32.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        model.Product product3 = new model.Product((-1), "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (-1.0f));
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 'a');
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass11 = productList10.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 10);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass21 = searchService0.getClass();
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        model.Product product3 = new model.Product((int) (short) 1, "", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 10.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        model.Product product3 = new model.Product(35, "hi!", (double) 97);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 10.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 'a');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
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
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        java.lang.String str14 = product3.getName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
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
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        model.Product product3 = new model.Product((-1), "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        model.Product product3 = new model.Product(0, "", 52.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        double double14 = product3.getPrice();
        int int15 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 1L);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) ' ');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 10.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        model.Product product3 = new model.Product(35, "", (double) 100L);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        model.Product product3 = new model.Product(0, "hi!", (double) 52);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
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
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 52);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        int int11 = product3.getId();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass41 = productList40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        int int14 = product3.getId();
        int int15 = product3.getId();
        java.lang.String str16 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 100);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 1L);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        model.Product product3 = new model.Product(32, "", 32.0d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        model.Product product3 = new model.Product((-1), "hi!", (double) 0.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        model.Product product3 = new model.Product((int) (byte) 0, "", 10.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        model.Product product3 = new model.Product(100, "", (double) 'a');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        double double14 = product3.getPrice();
        double double15 = product3.getPrice();
        double double16 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        model.Product product3 = new model.Product(100, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1L));
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        model.Product product3 = new model.Product((int) (short) 1, "", 10.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) ' ');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 100L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        model.Product product3 = new model.Product(35, "", (double) (short) -1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass25 = productList24.getClass();
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
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 52);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        model.Product product3 = new model.Product((int) '#', "", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 10.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        model.Product product3 = new model.Product(10, "", (double) (short) 1);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        model.Product product3 = new model.Product(35, "", (double) 10.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        model.Product product3 = new model.Product(1, "", (double) (-1));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) (byte) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        model.Product product3 = new model.Product(100, "", (double) (short) -1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        model.Product product3 = new model.Product(97, "hi!", (double) 0.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        model.Product product3 = new model.Product(35, "", 52.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
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
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 35);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
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
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
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
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) (byte) 0);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        model.Product product3 = new model.Product(32, "", (-1.0d));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 100L);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
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
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        java.lang.Class<?> wildcardClass27 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 52);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) '4');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        model.Product product3 = new model.Product(35, "", (-1.0d));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        model.Product product3 = new model.Product(97, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        java.lang.String str13 = product3.getName();
        java.lang.String str14 = product3.getName();
        int int15 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        model.Product product3 = new model.Product(97, "", (double) (short) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        int int12 = product3.getId();
        java.lang.String str13 = product3.getName();
        int int14 = product3.getId();
        java.lang.String str15 = product3.getName();
        int int16 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        model.Product product3 = new model.Product(0, "", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 10);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        model.Product product3 = new model.Product(100, "hi!", (double) 97);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        model.Product product3 = new model.Product(100, "hi!", (-1.0d));
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        model.Product product3 = new model.Product((int) (short) 1, "", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        model.Product product3 = new model.Product(10, "hi!", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        model.Product product3 = new model.Product(35, "", (double) (-1));
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (-1));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
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
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        model.Product product3 = new model.Product(52, "", (double) 'a');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        model.Product product3 = new model.Product(35, "", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass41 = searchService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
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
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        model.Product product3 = new model.Product(32, "hi!", (double) 97);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
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
        int int14 = product3.getId();
        double double15 = product3.getPrice();
        double double16 = product3.getPrice();
        java.lang.String str17 = product3.getName();
        double double18 = product3.getPrice();
        double double19 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (byte) 10);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        model.Product product3 = new model.Product(1, "", 52.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        model.Product product3 = new model.Product((int) 'a', "", (double) '4');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        model.Product product3 = new model.Product(97, "", (double) 0);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
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
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        model.Product product3 = new model.Product(10, "", (double) 'a');
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
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
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
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
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        java.lang.Class<?> wildcardClass35 = productList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
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
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        model.Product product3 = new model.Product(1, "hi!", (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        model.Product product3 = new model.Product((int) (short) 100, "", 10.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        model.Product product3 = new model.Product(1, "", (double) 100L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        model.Product product3 = new model.Product((int) (byte) 0, "", 52.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        double double15 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        model.Product product3 = new model.Product(0, "hi!", (double) '#');
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        model.Product product3 = new model.Product(10, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
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
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        model.Product product3 = new model.Product((int) (byte) 0, "", 52.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) ' ');
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        model.Product product3 = new model.Product(10, "", 35.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
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
        java.lang.Class<?> wildcardClass39 = searchService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        model.Product product3 = new model.Product(52, "hi!", 1.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        java.lang.Class<?> wildcardClass39 = searchService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass27 = searchService0.getClass();
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
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
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
        int int13 = product3.getId();
        int int14 = product3.getId();
        double double15 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
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
        java.lang.String str13 = product3.getName();
        double double14 = product3.getPrice();
        java.lang.String str15 = product3.getName();
        int int16 = product3.getId();
        int int17 = product3.getId();
        int int18 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
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
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
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
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 1.0f);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        model.Product product3 = new model.Product(32, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 97.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        model.Product product3 = new model.Product(1, "", (double) '#');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        model.Product product3 = new model.Product(32, "", (double) '#');
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        model.Product product3 = new model.Product(1, "", (double) 52);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        int int15 = product3.getId();
        double double16 = product3.getPrice();
        double double17 = product3.getPrice();
        int int18 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        model.Product product3 = new model.Product(10, "hi!", 100.0d);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        int int13 = product3.getId();
        double double14 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        model.Product product3 = new model.Product(35, "hi!", (double) 0.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 10.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
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
        int int13 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        model.Product product3 = new model.Product(0, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
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
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        model.Product product3 = new model.Product((int) '#', "", 97.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 10L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        model.Product product3 = new model.Product(10, "", (double) (short) 10);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

