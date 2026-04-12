import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        model.Product product3 = new model.Product(100, "hi!", (double) 'a');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        model.Product product3 = new model.Product(52, "hi!", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        model.Product product3 = new model.Product((int) (short) 1, "", (-1.0d));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
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
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 100);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
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
        java.util.List<model.Product> productList46 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList48 = searchService0.searchProducts("");
        java.util.List<model.Product> productList50 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass51 = productList50.getClass();
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
        org.junit.Assert.assertNotNull(productList50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        model.Product product3 = new model.Product(97, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        model.Product product3 = new model.Product(0, "", (double) (-1));
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        model.Product product3 = new model.Product(1, "", (double) (-1));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 1L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
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
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 10.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
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
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
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
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
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
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        model.Product product3 = new model.Product((int) (short) 1, "", (-1.0d));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        model.Product product3 = new model.Product(97, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 52);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        model.Product product3 = new model.Product((-1), "hi!", (double) 52);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 10);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        model.Product product3 = new model.Product(97, "hi!", (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        model.Product product3 = new model.Product((int) 'a', "", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 97.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        model.Product product3 = new model.Product(1, "", (double) 1L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
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
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        model.Product product3 = new model.Product(32, "", 100.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) ' ');
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", 35.0d);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        model.Product product3 = new model.Product(0, "hi!", (double) (byte) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        double double13 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (-1.0d));
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
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
        int int16 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        model.Product product3 = new model.Product(97, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        model.Product product3 = new model.Product((-1), "", 10.0d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        model.Product product3 = new model.Product((int) ' ', "", (double) 100.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        model.Product product3 = new model.Product(100, "", (double) '4');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        model.Product product3 = new model.Product(0, "hi!", (double) 100.0f);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
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
        double double13 = product3.getPrice();
        java.lang.String str14 = product3.getName();
        int int15 = product3.getId();
        int int16 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        model.Product product3 = new model.Product(100, "", (double) 100);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        model.Product product3 = new model.Product(10, "hi!", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 1.0d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 1L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 10L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
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
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 52);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        model.Product product3 = new model.Product((int) ' ', "", (double) 'a');
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 35);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        model.Product product3 = new model.Product(1, "", (double) (-1));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        model.Product product3 = new model.Product((-1), "", (double) (byte) 10);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        model.Product product3 = new model.Product(32, "", (double) '4');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        model.Product product3 = new model.Product(52, "", (double) 35);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (short) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
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
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 0.0f);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
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
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) (-1L));
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (-1));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        model.Product product3 = new model.Product((int) (short) 1, "", (-1.0d));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
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
        int int14 = product3.getId();
        java.lang.String str15 = product3.getName();
        int int16 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        model.Product product3 = new model.Product(100, "", (double) 1.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        model.Product product3 = new model.Product((int) (byte) 1, "", (-1.0d));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        model.Product product3 = new model.Product(35, "", (double) (-1.0f));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 97);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        model.Product product3 = new model.Product(97, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1));
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
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
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) (-1));
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) ' ');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (-1));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 35.0d);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass19 = searchService0.getClass();
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
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        model.Product product3 = new model.Product(35, "hi!", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        model.Product product3 = new model.Product(10, "", (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        model.Product product3 = new model.Product(10, "", (double) 52);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 1L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
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
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (short) -1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        model.Product product3 = new model.Product((int) ' ', "", (double) 0);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        model.Product product3 = new model.Product(35, "", (double) 52);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
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
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
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
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        model.Product product3 = new model.Product(10, "", (double) (-1L));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
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
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        model.Product product3 = new model.Product(32, "hi!", (double) 32);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        model.Product product3 = new model.Product(35, "", (double) (short) 1);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 52);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        model.Product product3 = new model.Product((-1), "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        model.Product product3 = new model.Product(0, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        model.Product product3 = new model.Product((int) '4', "", (double) (byte) 0);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 1.0d);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        int int13 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        model.Product product3 = new model.Product((int) '4', "", 52.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        model.Product product3 = new model.Product(35, "hi!", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        model.Product product3 = new model.Product((int) '#', "", (double) 32);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
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
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
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
        double double15 = product3.getPrice();
        int int16 = product3.getId();
        java.lang.String str17 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 0.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        model.Product product3 = new model.Product(10, "hi!", (double) 1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
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
        java.lang.Class<?> wildcardClass68 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        model.Product product3 = new model.Product(97, "hi!", (double) 'a');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        model.Product product3 = new model.Product(0, "hi!", 10.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
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
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 10L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        model.Product product3 = new model.Product((int) ' ', "hi!", 100.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("");
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
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (short) 10);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        model.Product product3 = new model.Product((int) 'a', "hi!", 52.0d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        model.Product product3 = new model.Product(52, "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        model.Product product3 = new model.Product((int) '#', "", 52.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        model.Product product3 = new model.Product((int) (byte) 100, "", 1.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) (short) -1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        model.Product product3 = new model.Product((-1), "hi!", (double) 10L);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        model.Product product3 = new model.Product((-1), "hi!", (double) 52);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        model.Product product3 = new model.Product(35, "", (double) (byte) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
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
        double double14 = product3.getPrice();
        int int15 = product3.getId();
        java.lang.String str16 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
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
        double double15 = product3.getPrice();
        double double16 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 100L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
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
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (-1));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        model.Product product3 = new model.Product((int) 'a', "", (double) ' ');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        int int12 = product3.getId();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        model.Product product3 = new model.Product((int) 'a', "", (double) ' ');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
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
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) '4');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 10.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass29 = productList28.getClass();
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
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList38 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList40 = searchService0.searchProducts("hi!");
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
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        model.Product product3 = new model.Product((int) '4', "hi!", 35.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '#');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 'a');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 10.0f);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        model.Product product3 = new model.Product((-1), "hi!", (double) 100);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass35 = searchService0.getClass();
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
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (short) 10);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
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
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        model.Product product3 = new model.Product((int) '#', "", (double) 32);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        model.Product product3 = new model.Product(32, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        model.Product product3 = new model.Product((int) (short) 100, "", 100.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        model.Product product3 = new model.Product(100, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 100.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        model.Product product3 = new model.Product((int) (short) 10, "", 100.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
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
        double double14 = product3.getPrice();
        int int15 = product3.getId();
        double double16 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        model.Product product3 = new model.Product((int) (short) 100, "", (-1.0d));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        model.Product product3 = new model.Product(35, "hi!", (double) 100L);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        model.Product product3 = new model.Product(32, "hi!", (double) (short) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 1.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
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
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("");
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
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        model.Product product3 = new model.Product(35, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 'a');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
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
        double double16 = product3.getPrice();
        int int17 = product3.getId();
        java.lang.String str18 = product3.getName();
        java.lang.String str19 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
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
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        model.Product product3 = new model.Product((int) '#', "", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
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
        java.lang.String str13 = product3.getName();
        java.lang.Class<?> wildcardClass14 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        model.Product product3 = new model.Product(35, "", (double) (byte) -1);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
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
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        model.Product product3 = new model.Product((int) '4', "", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        model.Product product3 = new model.Product((-1), "", (double) 35);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        model.Product product3 = new model.Product((int) ' ', "", (double) 100.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        model.Product product3 = new model.Product(35, "hi!", (double) 1);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
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
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        double double16 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        model.Product product3 = new model.Product(0, "", (double) 100.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        model.Product product3 = new model.Product(97, "hi!", (double) 10L);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        model.Product product3 = new model.Product(97, "hi!", (double) 0.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        model.Product product3 = new model.Product((int) (byte) 0, "", 52.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        model.Product product3 = new model.Product((-1), "hi!", (double) 52);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
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
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 1L);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        model.Product product3 = new model.Product(52, "hi!", 0.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        model.Product product3 = new model.Product((-1), "", (double) (byte) 10);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        model.Product product3 = new model.Product(35, "hi!", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        model.Product product3 = new model.Product((int) '4', "", (double) 'a');
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        model.Product product3 = new model.Product(97, "", (double) 10.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        model.Product product3 = new model.Product((int) (byte) -1, "", 10.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        model.Product product3 = new model.Product(32, "hi!", (double) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 52);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) '#');
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
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
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        model.Product product3 = new model.Product(52, "", (double) 0.0f);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 97.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        model.Product product3 = new model.Product(0, "hi!", (double) ' ');
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        model.Product product3 = new model.Product((int) (short) 100, "", 100.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        model.Product product3 = new model.Product(10, "", (double) (short) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        model.Product product3 = new model.Product(0, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        double double15 = product3.getPrice();
        double double16 = product3.getPrice();
        java.lang.String str17 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
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
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        model.Product product3 = new model.Product((int) 'a', "", 97.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        model.Product product3 = new model.Product(0, "", (double) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        model.Product product3 = new model.Product(97, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        model.Product product3 = new model.Product((-1), "", (double) 'a');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) 0L);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        model.Product product3 = new model.Product(52, "", (double) 0);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        model.Product product3 = new model.Product(1, "", (double) 100L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        model.Product product3 = new model.Product(52, "", (double) 10.0f);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        model.Product product3 = new model.Product((-1), "hi!", (double) 10L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        model.Product product3 = new model.Product((int) '#', "hi!", (-1.0d));
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 100.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        model.Product product3 = new model.Product(0, "", 52.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        model.Product product3 = new model.Product((int) (short) 0, "", 97.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        model.Product product3 = new model.Product((int) (byte) 1, "", 52.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        model.Product product3 = new model.Product((int) 'a', "", (double) (-1));
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (byte) 100);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (short) -1);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 0.0d);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        model.Product product3 = new model.Product((int) '#', "", 10.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        model.Product product3 = new model.Product(35, "hi!", (double) (short) -1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        model.Product product3 = new model.Product(1, "", 32.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        model.Product product3 = new model.Product(97, "hi!", (double) ' ');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
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
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (short) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 10L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
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
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        model.Product product3 = new model.Product(10, "", (double) (short) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        model.Product product3 = new model.Product((-1), "", (double) 0.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        model.Product product3 = new model.Product(32, "hi!", 35.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (byte) 10);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        model.Product product3 = new model.Product((int) 'a', "hi!", (-1.0d));
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
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
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
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
        java.lang.Class<?> wildcardClass29 = productList28.getClass();
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
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        model.Product product3 = new model.Product(52, "", (double) (short) 0);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        model.Product product3 = new model.Product((int) ' ', "hi!", 97.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 1.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
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
        java.lang.String str15 = product3.getName();
        double double16 = product3.getPrice();
        java.lang.String str17 = product3.getName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (short) 100);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        model.Product product3 = new model.Product(97, "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
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
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 35);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        int int11 = product3.getId();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 100.0f);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 52);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
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
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) -1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        model.Product product3 = new model.Product(52, "hi!", (double) (byte) 10);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("");
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
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        model.Product product3 = new model.Product(100, "", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        model.Product product3 = new model.Product((-1), "hi!", (double) 0.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 100);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        model.Product product3 = new model.Product((int) 'a', "", 52.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 'a');
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        model.Product product3 = new model.Product((-1), "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        int int12 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        data.ProductRepository productRepository0 = new data.ProductRepository();
        java.util.List<model.Product> productList1 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList2 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList3 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList4 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList5 = productRepository0.getAllProducts();
        java.lang.Class<?> wildcardClass6 = productList5.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 100L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        model.Product product3 = new model.Product(10, "hi!", (double) (byte) 10);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        model.Product product3 = new model.Product((int) '#', "", (double) 32);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        model.Product product3 = new model.Product((int) '#', "", (double) (byte) 100);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        model.Product product3 = new model.Product(0, "hi!", 35.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
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
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        model.Product product3 = new model.Product(1, "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (short) 1);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass15 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
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
        java.lang.String str15 = product3.getName();
        java.lang.String str16 = product3.getName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        model.Product product3 = new model.Product(0, "", (double) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        model.Product product3 = new model.Product(1, "", (double) (-1));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
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
        int int17 = product3.getId();
        java.lang.String str18 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (byte) 10);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
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
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        model.Product product3 = new model.Product((int) '#', "", (double) (short) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
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
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (short) -1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", 35.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) '4');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
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
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
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
        double double13 = product3.getPrice();
        double double14 = product3.getPrice();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
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
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
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
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) (byte) -1);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 35);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
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
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        model.Product product3 = new model.Product((int) '#', "", 32.0d);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        model.Product product3 = new model.Product(100, "hi!", 10.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
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
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        model.Product product3 = new model.Product((int) '4', "", (double) (-1));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        model.Product product3 = new model.Product((int) 'a', "", 35.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        model.Product product3 = new model.Product(10, "", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        model.Product product3 = new model.Product((-1), "", (double) 'a');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
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
        java.lang.String str16 = product3.getName();
        int int17 = product3.getId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 52.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        model.Product product3 = new model.Product((int) (short) -1, "", 52.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
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
        double double13 = product3.getPrice();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        java.lang.String str16 = product3.getName();
        java.lang.String str17 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        model.Product product3 = new model.Product((int) (short) 10, "", 32.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
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
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        model.Product product3 = new model.Product(32, "hi!", (double) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
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
        java.lang.String str14 = product3.getName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
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
        double double16 = product3.getPrice();
        int int17 = product3.getId();
        java.lang.String str18 = product3.getName();
        double double19 = product3.getPrice();
        java.lang.String str20 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
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
        int int14 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        model.Product product3 = new model.Product((int) 'a', "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 1L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
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
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
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
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) 0);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 10.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
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
        java.util.List<model.Product> productList20 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("");
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
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
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        model.Product product3 = new model.Product(10, "hi!", (double) 97);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        model.Product product3 = new model.Product((int) 'a', "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
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
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 1L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100L);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) (byte) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        model.Product product3 = new model.Product(52, "", (double) 10.0f);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        double double13 = product3.getPrice();
        int int14 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        model.Product product3 = new model.Product((int) ' ', "hi!", 100.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        model.Product product3 = new model.Product((int) (byte) 0, "", 52.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        model.Product product3 = new model.Product(0, "hi!", (double) (byte) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        model.Product product3 = new model.Product(52, "", (double) 35);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        model.Product product3 = new model.Product(0, "", 97.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        model.Product product3 = new model.Product((int) 'a', "", (double) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        model.Product product3 = new model.Product(10, "hi!", (double) 100L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
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
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        model.Product product3 = new model.Product(10, "hi!", (double) 97);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        model.Product product3 = new model.Product(35, "hi!", (double) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
        java.util.List<model.Product> productList22 = searchService0.searchProducts("hi!");
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
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        model.Product product3 = new model.Product((-1), "", (double) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
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
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        model.Product product3 = new model.Product(10, "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        model.Product product3 = new model.Product(97, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) (-1));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
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
        int int13 = product3.getId();
        java.lang.String str14 = product3.getName();
        java.lang.String str15 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) 10.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        model.Product product3 = new model.Product((int) (byte) -1, "", 52.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        model.Product product3 = new model.Product(35, "hi!", (double) (short) -1);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        model.Product product3 = new model.Product((int) '#', "", 10.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) (short) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        java.lang.String str13 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
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
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
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
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        model.Product product3 = new model.Product(0, "hi!", (double) 100);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (short) 1);
    }
}

