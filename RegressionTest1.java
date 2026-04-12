import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        model.Product product3 = new model.Product((int) (short) 10, "", (-1.0d));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        java.lang.Class<?> wildcardClass14 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        model.Product product3 = new model.Product((int) ' ', "", (double) 35);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        model.Product product3 = new model.Product(35, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        model.Product product3 = new model.Product((int) ' ', "hi!", (-1.0d));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.Class<?> wildcardClass17 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 100L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (byte) -1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        model.Product product3 = new model.Product(0, "hi!", (double) 97);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 10L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        int int15 = product3.getId();
        java.lang.Class<?> wildcardClass16 = product3.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        model.Product product3 = new model.Product(1, "", 10.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 10.0f);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        model.Product product3 = new model.Product((int) 'a', "", (double) 35);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 35);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        model.Product product3 = new model.Product(52, "hi!", 1.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        model.Product product3 = new model.Product(100, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        double double15 = product3.getPrice();
        java.lang.Class<?> wildcardClass16 = product3.getClass();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        model.Product product3 = new model.Product(0, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 10L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) (byte) -1);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        model.Product product3 = new model.Product((-1), "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        java.lang.Class<?> wildcardClass14 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) '4');
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        model.Product product3 = new model.Product(0, "", (double) 32);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        model.Product product3 = new model.Product(32, "", 100.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        model.Product product3 = new model.Product(52, "hi!", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        model.Product product3 = new model.Product(35, "hi!", (double) 'a');
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        model.Product product3 = new model.Product((int) '#', "", 52.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        model.Product product3 = new model.Product(97, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        model.Product product3 = new model.Product(52, "", (double) 10L);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 'a');
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 97);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        model.Product product3 = new model.Product((int) 'a', "", (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", 32.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        model.Product product3 = new model.Product(1, "", (double) (-1));
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        int int11 = product3.getId();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) '#');
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        model.Product product3 = new model.Product((int) (short) 100, "", 100.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        model.Product product3 = new model.Product(10, "", (double) (short) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '#');
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        model.Product product3 = new model.Product((int) ' ', "", (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        model.Product product3 = new model.Product(32, "", 97.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        model.Product product3 = new model.Product(35, "", (double) 10L);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        model.Product product3 = new model.Product((int) ' ', "", (double) 52);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        double double14 = product3.getPrice();
        java.lang.String str15 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.Class<?> wildcardClass18 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) (short) 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        model.Product product3 = new model.Product((int) '#', "hi!", 97.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 0L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 52);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        model.Product product3 = new model.Product(1, "", 0.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass11 = productList10.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (-1));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass7 = productList6.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        model.Product product3 = new model.Product(35, "hi!", 0.0d);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (byte) 1);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        model.Product product3 = new model.Product(52, "hi!", (double) (short) 0);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) (-1L));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        model.Product product3 = new model.Product((int) 'a', "", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        model.Product product3 = new model.Product((-1), "", (double) 1.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        model.Product product3 = new model.Product((int) (byte) 0, "", 52.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass7 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        model.Product product3 = new model.Product(0, "", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        model.Product product3 = new model.Product((int) 'a', "", (double) ' ');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        model.Product product3 = new model.Product((int) (short) 10, "", (-1.0d));
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        model.Product product3 = new model.Product((int) (byte) 10, "", 52.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass7 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        model.Product product3 = new model.Product((int) (short) 1, "", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        model.Product product3 = new model.Product(97, "", (double) 10.0f);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        model.Product product3 = new model.Product(0, "", (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 0L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        model.Product product3 = new model.Product(100, "", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        model.Product product3 = new model.Product(0, "hi!", 10.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        model.Product product3 = new model.Product(35, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        model.Product product3 = new model.Product(0, "hi!", (double) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        model.Product product3 = new model.Product(35, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        int int14 = product3.getId();
        java.lang.Class<?> wildcardClass15 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        model.Product product3 = new model.Product(0, "", (double) 97);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        model.Product product3 = new model.Product((int) (short) 10, "", 100.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        model.Product product3 = new model.Product((int) '#', "", (double) ' ');
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 32);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        model.Product product3 = new model.Product(35, "hi!", 1.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) '4');
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        model.Product product3 = new model.Product((int) '#', "", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        model.Product product3 = new model.Product(52, "", (-1.0d));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        model.Product product3 = new model.Product(10, "", (double) (short) 10);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 10L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        model.Product product3 = new model.Product(10, "", (double) (short) -1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("");
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        model.Product product3 = new model.Product(10, "", (double) 52);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        java.lang.String str12 = product3.getName();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        model.Product product3 = new model.Product(1, "hi!", (-1.0d));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        model.Product product3 = new model.Product(10, "hi!", (double) 100L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (-1));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        model.Product product3 = new model.Product((int) '4', "", (double) 10L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        java.lang.Class<?> wildcardClass15 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        model.Product product3 = new model.Product(97, "", 1.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 52);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.lang.Class<?> wildcardClass20 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        model.Product product3 = new model.Product((-1), "hi!", (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 0.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        double double14 = product3.getPrice();
        java.lang.Class<?> wildcardClass15 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (-1));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        model.Product product3 = new model.Product(0, "", (double) 52);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) (-1L));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        model.Product product3 = new model.Product(10, "hi!", 0.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        model.Product product3 = new model.Product(100, "", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) ' ');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        model.Product product3 = new model.Product((int) (short) 1, "", 97.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        model.Product product3 = new model.Product((int) ' ', "", (double) '#');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        model.Product product3 = new model.Product(0, "", (double) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        model.Product product3 = new model.Product(35, "hi!", 1.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        model.Product product3 = new model.Product(1, "", (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        model.Product product3 = new model.Product(35, "", (double) 10.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        model.Product product3 = new model.Product(35, "", (double) ' ');
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '#');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 52);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        int int16 = product3.getId();
        double double17 = product3.getPrice();
        java.lang.String str18 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) '4');
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 35);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        model.Product product3 = new model.Product(52, "", (double) 10L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 35);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.Class<?> wildcardClass14 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        model.Product product3 = new model.Product(97, "", (double) 10.0f);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 'a');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.Class<?> wildcardClass19 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        model.Product product3 = new model.Product((int) (short) 0, "", 97.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        model.Product product3 = new model.Product((int) 'a', "", (double) '4');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        model.Product product3 = new model.Product((int) '#', "", 52.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) ' ');
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        model.Product product3 = new model.Product(52, "", (double) 'a');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        model.Product product3 = new model.Product((int) (byte) 100, "", 97.0d);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        model.Product product3 = new model.Product(52, "hi!", 35.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        model.Product product3 = new model.Product(32, "", 97.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        model.Product product3 = new model.Product(100, "", (double) 10L);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        model.Product product3 = new model.Product(52, "", (double) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        model.Product product3 = new model.Product((int) (byte) -1, "", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 0L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 52);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 1.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        model.Product product3 = new model.Product(10, "", (double) (short) 10);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass11 = searchService0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        model.Product product3 = new model.Product((int) '#', "", (-1.0d));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        model.Product product3 = new model.Product(0, "", (double) 0.0f);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        model.Product product3 = new model.Product(32, "", 97.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        model.Product product3 = new model.Product((int) (byte) 10, "", 10.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        model.Product product3 = new model.Product(35, "hi!", 1.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        model.Product product3 = new model.Product(0, "", (double) 1);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 52);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        model.Product product3 = new model.Product((-1), "hi!", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        model.Product product3 = new model.Product((int) '#', "", (double) 0L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        model.Product product3 = new model.Product(35, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        model.Product product3 = new model.Product((int) 'a', "", (double) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        model.Product product3 = new model.Product(10, "hi!", (double) 100L);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        model.Product product3 = new model.Product((-1), "", 0.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        model.Product product3 = new model.Product(52, "", (double) '4');
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", (double) 1L);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 97);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        model.Product product3 = new model.Product(32, "", (double) (-1L));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 'a');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (-1L));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (short) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        model.Product product3 = new model.Product(0, "", 52.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (-1));
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        model.Product product3 = new model.Product(35, "", (double) ' ');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        model.Product product3 = new model.Product(0, "", (double) (-1.0f));
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        model.Product product3 = new model.Product(35, "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 10L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        model.Product product3 = new model.Product((-1), "hi!", 100.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        model.Product product3 = new model.Product((int) '#', "", (double) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '4');
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        model.Product product3 = new model.Product(10, "hi!", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 10.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        model.Product product3 = new model.Product((int) (byte) 0, "", 0.0d);
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        int int13 = product3.getId();
        java.lang.Class<?> wildcardClass14 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) '#');
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.lang.Class<?> wildcardClass11 = productList10.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        model.Product product3 = new model.Product((int) (byte) 10, "", 10.0d);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        model.Product product3 = new model.Product(1, "hi!", (double) (short) 100);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        model.Product product3 = new model.Product((int) '4', "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.Class<?> wildcardClass17 = product3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        model.Product product3 = new model.Product(1, "hi!", (double) (byte) 0);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        model.Product product3 = new model.Product(0, "hi!", (double) 0.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        model.Product product3 = new model.Product(35, "hi!", (double) ' ');
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        model.Product product3 = new model.Product(100, "", (double) (byte) 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 10);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        model.Product product3 = new model.Product((int) ' ', "", 35.0d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        model.Product product3 = new model.Product(100, "hi!", (double) (-1L));
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        model.Product product3 = new model.Product(35, "hi!", (double) (short) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        model.Product product3 = new model.Product(32, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.lang.String str15 = product3.getName();
        java.lang.Class<?> wildcardClass16 = product3.getClass();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        model.Product product3 = new model.Product((int) (byte) 0, "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 10);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        model.Product product3 = new model.Product((int) '#', "hi!", 0.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.lang.Class<?> wildcardClass29 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        model.Product product3 = new model.Product(97, "", (double) (byte) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        model.Product product3 = new model.Product(1, "hi!", 1.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        model.Product product3 = new model.Product((int) '4', "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        model.Product product3 = new model.Product((int) '#', "", (double) (short) 10);
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 0);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        model.Product product3 = new model.Product(1, "", (double) 100L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        model.Product product3 = new model.Product(32, "hi!", (double) (byte) 10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        model.Product product3 = new model.Product((int) 'a', "", (double) '4');
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        model.Product product3 = new model.Product(97, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        model.Product product3 = new model.Product(52, "", (double) 10L);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        model.Product product3 = new model.Product(52, "hi!", 10.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        model.Product product3 = new model.Product((int) '#', "", 52.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        double double15 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        model.Product product3 = new model.Product(0, "", (double) (-1.0f));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        model.Product product3 = new model.Product((int) 'a', "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        model.Product product3 = new model.Product(35, "hi!", (double) 'a');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 10L);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        int int12 = product3.getId();
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        model.Product product3 = new model.Product(10, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        model.Product product3 = new model.Product(1, "hi!", 35.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        model.Product product3 = new model.Product(35, "hi!", (double) 97);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        model.Product product3 = new model.Product(10, "", 52.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        model.Product product3 = new model.Product(97, "", (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        model.Product product3 = new model.Product(35, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        model.Product product3 = new model.Product((-1), "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        model.Product product3 = new model.Product(52, "hi!", 35.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (short) 10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 'a');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        model.Product product3 = new model.Product((-1), "", (double) (byte) 10);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        model.Product product3 = new model.Product(32, "hi!", (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        model.Product product3 = new model.Product(0, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        model.Product product3 = new model.Product(97, "", (double) 0L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) '#');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        model.Product product3 = new model.Product(35, "hi!", (double) (short) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 52);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        model.Product product3 = new model.Product(100, "hi!", (double) 35);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        model.Product product3 = new model.Product((int) (byte) -1, "", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("hi!");
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        model.Product product3 = new model.Product(35, "", (double) 10L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        model.Product product3 = new model.Product(35, "hi!", (double) 32);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        model.Product product3 = new model.Product((int) '4', "", 35.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        model.Product product3 = new model.Product(0, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        model.Product product3 = new model.Product((-1), "", (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        model.Product product3 = new model.Product(32, "", (double) ' ');
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
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
}

