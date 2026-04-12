import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        int int14 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        model.Product product3 = new model.Product((-1), "hi!", 35.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        model.Product product3 = new model.Product(0, "", (double) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
        java.util.List<model.Product> productList18 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList20 = searchService0.searchProducts("");
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
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 35);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        model.Product product3 = new model.Product(97, "", 100.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        model.Product product3 = new model.Product(100, "", (double) (byte) -1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 35);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        model.Product product3 = new model.Product(1, "hi!", (double) (short) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        model.Product product3 = new model.Product(97, "", (double) 10);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        model.Product product3 = new model.Product(1, "hi!", 100.0d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        double double12 = product3.getPrice();
        java.lang.Class<?> wildcardClass13 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        model.Product product3 = new model.Product((int) (short) 0, "", 1.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 100.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        model.Product product3 = new model.Product((int) ' ', "", (double) 0.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) ' ');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (short) -1);
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
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '4');
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        model.Product product3 = new model.Product(97, "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        model.Product product3 = new model.Product((int) '4', "", (double) (byte) 10);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        model.Product product3 = new model.Product((int) (short) 0, "", (-1.0d));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        model.Product product3 = new model.Product(1, "hi!", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        double double19 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 0);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 0.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        model.Product product3 = new model.Product((int) 'a', "", (double) 10L);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        model.Product product3 = new model.Product(10, "", (double) (short) 10);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) 'a');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 10.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) (byte) -1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        model.Product product3 = new model.Product(52, "hi!", (double) (short) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", 10.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        double double11 = product3.getPrice();
        int int12 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        model.Product product3 = new model.Product((int) 'a', "", (double) ' ');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
        java.lang.Class<?> wildcardClass14 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        model.Product product3 = new model.Product((int) '#', "", (double) 97);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        model.Product product3 = new model.Product((int) ' ', "", (double) '#');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        model.Product product3 = new model.Product(100, "", (double) 32);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        model.Product product3 = new model.Product((int) '#', "", (double) 10.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        model.Product product3 = new model.Product((int) (byte) 100, "", 0.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 97);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        double double14 = product3.getPrice();
        java.lang.String str15 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        model.Product product3 = new model.Product(0, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 10L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        int int15 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 32);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 1);
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
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) (short) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        java.lang.Class<?> wildcardClass12 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        model.Product product3 = new model.Product((int) (byte) 10, "", 10.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("");
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
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 10L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        model.Product product3 = new model.Product((int) '4', "", 0.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        model.Product product3 = new model.Product(0, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        model.Product product3 = new model.Product(10, "", 35.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        model.Product product3 = new model.Product(0, "hi!", (double) '4');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        model.Product product3 = new model.Product(1, "", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        model.Product product3 = new model.Product(10, "", (double) 10.0f);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        model.Product product3 = new model.Product((int) 'a', "hi!", 1.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        model.Product product3 = new model.Product(52, "", (double) (byte) 1);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        data.ProductRepository productRepository0 = new data.ProductRepository();
        java.util.List<model.Product> productList1 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList2 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList3 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList4 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList5 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList6 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList7 = productRepository0.getAllProducts();
        java.util.List<model.Product> productList8 = productRepository0.getAllProducts();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (-1));
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 0);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        model.Product product3 = new model.Product((int) 'a', "hi!", 10.0d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        java.lang.String str15 = product3.getName();
        int int16 = product3.getId();
        java.lang.String str17 = product3.getName();
        int int18 = product3.getId();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        java.lang.String str13 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 10L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        model.Product product3 = new model.Product(100, "hi!", (double) 97);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 10);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        model.Product product3 = new model.Product((int) (short) 0, "", 1.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 97.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        model.Product product3 = new model.Product((int) ' ', "hi!", (double) ' ');
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", 52.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        model.Product product3 = new model.Product(0, "", 100.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (short) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        model.Product product3 = new model.Product((int) (short) -1, "", 1.0d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        model.Product product3 = new model.Product(1, "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        model.Product product3 = new model.Product(0, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        model.Product product3 = new model.Product((int) (byte) -1, "", 52.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        model.Product product3 = new model.Product((int) '#', "", (double) 0.0f);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        java.util.List<model.Product> productList28 = searchService0.searchProducts("");
        java.util.List<model.Product> productList30 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList32 = searchService0.searchProducts("hi!");
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
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) (byte) 100);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        model.Product product3 = new model.Product((int) (short) 0, "", 97.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        model.Product product3 = new model.Product((int) (short) 10, "", 1.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        model.Product product3 = new model.Product(100, "", (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        model.Product product3 = new model.Product(97, "", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 10.0f);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 0);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        model.Product product3 = new model.Product(100, "hi!", 100.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        model.Product product3 = new model.Product((int) 'a', "", (double) 10L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        model.Product product3 = new model.Product((int) '#', "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) 1);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        model.Product product3 = new model.Product((int) '#', "", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        model.Product product3 = new model.Product(1, "hi!", 52.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 1.0f);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        model.Product product3 = new model.Product((int) (byte) -1, "", 52.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        model.Product product3 = new model.Product(52, "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        model.Product product3 = new model.Product(97, "", (double) 10L);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        model.Product product3 = new model.Product((int) 'a', "hi!", 97.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        java.lang.String str13 = product3.getName();
        int int14 = product3.getId();
        double double15 = product3.getPrice();
        int int16 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        model.Product product3 = new model.Product(52, "hi!", 0.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        model.Product product3 = new model.Product((int) (short) 10, "", (-1.0d));
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) (short) 1);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        model.Product product3 = new model.Product((int) (short) -1, "", 52.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        model.Product product3 = new model.Product(0, "", (double) 0L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", 1.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        model.Product product3 = new model.Product(0, "hi!", (double) 0.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        model.Product product3 = new model.Product(0, "", (double) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        model.Product product3 = new model.Product((int) (byte) -1, "", 32.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (byte) 1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        model.Product product3 = new model.Product((int) '4', "", (double) 100L);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        java.util.List<model.Product> productList40 = searchService0.searchProducts("");
        java.util.List<model.Product> productList42 = searchService0.searchProducts("hi!");
        java.lang.Class<?> wildcardClass43 = productList42.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        model.Product product3 = new model.Product((int) (byte) 100, "", (double) 0);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 1);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 35);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) (short) 1);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
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
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        model.Product product3 = new model.Product((int) '#', "", (double) 1);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        model.Product product3 = new model.Product((int) '4', "", (-1.0d));
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        model.Product product3 = new model.Product(10, "hi!", (double) ' ');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        model.Product product3 = new model.Product(100, "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) 100);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        model.Product product3 = new model.Product((int) ' ', "hi!", (-1.0d));
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        model.Product product3 = new model.Product(52, "hi!", 10.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        model.Product product3 = new model.Product((int) (short) 10, "", 10.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        model.Product product3 = new model.Product(97, "hi!", (double) '#');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        java.util.List<model.Product> productList24 = searchService0.searchProducts("");
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
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 10L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) (-1L));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) (short) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (byte) 0);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        model.Product product3 = new model.Product(10, "", (double) (short) 10);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
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
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 35.0d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 'a');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        model.Product product3 = new model.Product(100, "", (double) 32);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        model.Product product3 = new model.Product(52, "", (double) 0);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        model.Product product3 = new model.Product(1, "hi!", 35.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (byte) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 1);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        model.Product product3 = new model.Product((int) (byte) -1, "", 1.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (short) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        model.Product product3 = new model.Product((int) ' ', "hi!", 1.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        model.Product product3 = new model.Product(97, "", (double) 10.0f);
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
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        model.Product product3 = new model.Product(1, "hi!", (double) 1L);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 10);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (-1L));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        model.Product product3 = new model.Product(1, "hi!", (double) 10.0f);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        model.Product product3 = new model.Product(10, "hi!", (double) (-1));
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        model.Product product3 = new model.Product(32, "", (double) (byte) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        model.Product product3 = new model.Product((int) '4', "", (double) 100.0f);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (short) 0);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        model.Product product3 = new model.Product(52, "", (double) (short) 1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        model.Product product3 = new model.Product((int) ' ', "", (double) '4');
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        java.lang.String str17 = product3.getName();
        double double18 = product3.getPrice();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        model.Product product3 = new model.Product((-1), "", (double) (byte) 10);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        model.Product product3 = new model.Product((int) (byte) 10, "", 1.0d);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList14 = searchService0.searchProducts("");
        java.util.List<model.Product> productList16 = searchService0.searchProducts("hi!");
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
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        model.Product product3 = new model.Product(35, "hi!", (double) 100);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) 52);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        java.util.List<model.Product> productList46 = searchService0.searchProducts("hi!");
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
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (byte) 100);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 32);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        model.Product product3 = new model.Product(35, "hi!", 35.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 0L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        model.Product product3 = new model.Product((int) 'a', "", (double) 10.0f);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        int int13 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        int int17 = product3.getId();
        int int18 = product3.getId();
        java.lang.String str19 = product3.getName();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        model.Product product3 = new model.Product(35, "hi!", (double) 97);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        model.Product product3 = new model.Product(10, "hi!", (double) '4');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        int int12 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        model.Product product3 = new model.Product((int) '#', "", 97.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        model.Product product3 = new model.Product((int) 'a', "", (double) 10);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        model.Product product3 = new model.Product(100, "hi!", 100.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        model.Product product3 = new model.Product((int) (short) 100, "", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        model.Product product3 = new model.Product((int) (byte) 1, "hi!", 97.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        model.Product product3 = new model.Product((int) (short) 10, "", (-1.0d));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        model.Product product3 = new model.Product(97, "", 52.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        java.util.List<model.Product> productList44 = searchService0.searchProducts("");
        java.util.List<model.Product> productList46 = searchService0.searchProducts("");
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
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        model.Product product3 = new model.Product((int) (byte) 1, "", 100.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        model.Product product3 = new model.Product(52, "", (double) 10.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        java.lang.String str11 = product3.getName();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        model.Product product3 = new model.Product(1, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        double double14 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) 10);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 10L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        model.Product product3 = new model.Product((int) '#', "", 52.0d);
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
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        java.util.List<model.Product> productList42 = searchService0.searchProducts("");
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
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        model.Product product3 = new model.Product((int) ' ', "", (double) 52);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        model.Product product3 = new model.Product(10, "hi!", (double) 1.0f);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) '#');
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        int int7 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        model.Product product3 = new model.Product((int) ' ', "hi!", (-1.0d));
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        double double11 = product3.getPrice();
        java.lang.String str12 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        double double10 = product3.getPrice();
        java.lang.String str11 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        model.Product product3 = new model.Product(97, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        int int11 = product3.getId();
        java.lang.String str12 = product3.getName();
        java.lang.String str13 = product3.getName();
        java.lang.Class<?> wildcardClass14 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        double double13 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) 10.0f);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        model.Product product3 = new model.Product((int) 'a', "", (double) 10.0f);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        model.Product product3 = new model.Product(10, "hi!", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
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
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        model.Product product3 = new model.Product((-1), "hi!", (double) (byte) -1);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        java.lang.String str13 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        model.Product product3 = new model.Product((int) (short) 10, "", (double) 1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
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
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", (double) 100);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
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
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 10);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        model.Product product3 = new model.Product((int) (byte) 1, "", 1.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
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
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 32);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        model.Product product3 = new model.Product(97, "", (double) 100L);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 10.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        int int9 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        model.Product product3 = new model.Product(97, "", 100.0d);
        int int4 = product3.getId();
        int int5 = product3.getId();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) 32);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        model.Product product3 = new model.Product((int) (short) 100, "", 1.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        double double10 = product3.getPrice();
        java.lang.Class<?> wildcardClass11 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        model.Product product3 = new model.Product((int) ' ', "", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) (-1L));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) '#');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 52);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) 'a');
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        java.lang.Class<?> wildcardClass30 = productList29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        model.Product product3 = new model.Product(52, "", 35.0d);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        model.Product product3 = new model.Product((int) (byte) 0, "", (double) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", 1.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        model.Product product3 = new model.Product(0, "hi!", (double) 100L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        model.Product product3 = new model.Product(1, "", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        int int10 = product3.getId();
        int int11 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        model.Product product3 = new model.Product((-1), "hi!", (double) 1L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) 52);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.String str10 = product3.getName();
        int int11 = product3.getId();
        double double12 = product3.getPrice();
        double double13 = product3.getPrice();
        java.lang.String str14 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        model.Product product3 = new model.Product(97, "", 10.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        java.util.List<model.Product> productList32 = searchService0.searchProducts("");
        java.util.List<model.Product> productList34 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList36 = searchService0.searchProducts("");
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
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        model.Product product3 = new model.Product((int) (byte) 100, "", 10.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 100L);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        model.Product product3 = new model.Product((int) ' ', "", 97.0d);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        int int15 = product3.getId();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        model.Product product3 = new model.Product((int) '4', "hi!", (double) 52);
        double double4 = product3.getPrice();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        model.Product product3 = new model.Product((int) '4', "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) '4');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        model.Product product3 = new model.Product(10, "", (double) 10L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) 100);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        model.Product product3 = new model.Product(10, "hi!", (double) 10);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        double double17 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("");
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
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        model.Product product3 = new model.Product((int) (byte) 10, "hi!", 10.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        model.Product product3 = new model.Product(52, "hi!", 97.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        model.Product product3 = new model.Product((int) (short) 10, "", 1.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        model.Product product3 = new model.Product((-1), "", 35.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        model.Product product3 = new model.Product((int) '4', "", 0.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        model.Product product3 = new model.Product(97, "hi!", (-1.0d));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        model.Product product3 = new model.Product(97, "hi!", 97.0d);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        model.Product product3 = new model.Product((int) (short) 10, "", 0.0d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) '#');
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        model.Product product3 = new model.Product(0, "", (double) 10);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        java.lang.Class<?> wildcardClass21 = productList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("");
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
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        model.Product product3 = new model.Product(0, "", (double) 1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (-1));
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        model.Product product3 = new model.Product((int) (byte) 100, "", 0.0d);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        model.Product product3 = new model.Product(0, "", (-1.0d));
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        model.Product product3 = new model.Product((int) (short) 1, "", (double) (-1L));
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) 0.0f);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) (short) -1);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        model.Product product3 = new model.Product(0, "hi!", (double) 52);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        model.Product product3 = new model.Product(100, "hi!", 52.0d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        model.Product product3 = new model.Product((int) (byte) 0, "hi!", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", (double) '#');
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        model.Product product3 = new model.Product(0, "", (double) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        int int14 = product3.getId();
        java.lang.String str15 = product3.getName();
        int int16 = product3.getId();
        java.lang.Class<?> wildcardClass17 = product3.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        java.lang.String str8 = product3.getName();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        model.Product product3 = new model.Product((int) (byte) -1, "", (double) 1);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) 0L);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        model.Product product3 = new model.Product((int) (byte) -1, "", 52.0d);
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        model.Product product3 = new model.Product(10, "hi!", 32.0d);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        model.Product product3 = new model.Product(35, "", 52.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        double double9 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        model.Product product3 = new model.Product(52, "", (double) 1L);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 0L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        model.Product product3 = new model.Product((int) '#', "", (double) (-1L));
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        int int7 = product3.getId();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        int int11 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
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
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        model.Product product3 = new model.Product((-1), "hi!", (double) 35);
        java.lang.String str4 = product3.getName();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        model.Product product3 = new model.Product((int) (short) 0, "", (double) '#');
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        double double9 = product3.getPrice();
        java.lang.String str10 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        model.Product product3 = new model.Product(10, "hi!", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 0);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        java.util.List<model.Product> productList26 = searchService0.searchProducts("hi!");
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
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        model.Product product3 = new model.Product((int) (short) -1, "", (double) 1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        model.Product product3 = new model.Product((int) '4', "hi!", 0.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 0L);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        model.Product product3 = new model.Product(52, "", (double) '#');
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        business.SearchService searchService0 = new business.SearchService();
        java.util.List<model.Product> productList2 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList4 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList6 = searchService0.searchProducts("");
        java.util.List<model.Product> productList8 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList10 = searchService0.searchProducts("hi!");
        java.util.List<model.Product> productList12 = searchService0.searchProducts("hi!");
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
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        double double8 = product3.getPrice();
        int int9 = product3.getId();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) '4');
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        int int7 = product3.getId();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        model.Product product3 = new model.Product(100, "hi!", 100.0d);
        double double4 = product3.getPrice();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        model.Product product3 = new model.Product(100, "hi!", (double) 1.0f);
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 10);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        model.Product product3 = new model.Product((int) (short) 100, "hi!", (double) 10L);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        model.Product product3 = new model.Product(100, "", (double) 0);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 'a');
        java.lang.String str4 = product3.getName();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        double double13 = product3.getPrice();
        int int14 = product3.getId();
        java.lang.String str15 = product3.getName();
        double double16 = product3.getPrice();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        model.Product product3 = new model.Product((int) 'a', "", (double) (byte) 10);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", 100.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        double double7 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        model.Product product3 = new model.Product((int) (byte) -1, "", 32.0d);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        model.Product product3 = new model.Product((int) (short) 10, "hi!", (double) 0);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        model.Product product3 = new model.Product(0, "", (double) 1.0f);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        int int6 = product3.getId();
        java.lang.String str7 = product3.getName();
        java.lang.Class<?> wildcardClass8 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        model.Product product3 = new model.Product(100, "hi!", (double) 0L);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        model.Product product3 = new model.Product(35, "", (double) 97);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        model.Product product3 = new model.Product(97, "", (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        model.Product product3 = new model.Product((int) (short) 100, "", (double) '#');
        int int4 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        model.Product product3 = new model.Product((int) '4', "hi!", 1.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        java.lang.Class<?> wildcardClass7 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        model.Product product3 = new model.Product(1, "", (double) 0L);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        model.Product product3 = new model.Product((int) '#', "hi!", (double) 0L);
        int int4 = product3.getId();
        int int5 = product3.getId();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 0.0d);
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
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        model.Product product3 = new model.Product((-1), "hi!", (double) (short) 100);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        model.Product product3 = new model.Product(52, "hi!", (double) 0L);
        double double4 = product3.getPrice();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        model.Product product3 = new model.Product(35, "", (double) '4');
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        model.Product product3 = new model.Product((int) (byte) -1, "hi!", 10.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.Class<?> wildcardClass6 = product3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        model.Product product3 = new model.Product(35, "", (double) (short) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        double double6 = product3.getPrice();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        model.Product product3 = new model.Product((int) (byte) 0, "", 35.0d);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        model.Product product3 = new model.Product((int) (short) -1, "hi!", 52.0d);
        java.lang.Class<?> wildcardClass4 = product3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        model.Product product3 = new model.Product(100, "hi!", (double) (short) 0);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        double double8 = product3.getPrice();
        java.lang.String str9 = product3.getName();
        java.lang.Class<?> wildcardClass10 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        model.Product product3 = new model.Product((-1), "hi!", (double) 100L);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        int int6 = product3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        model.Product product3 = new model.Product((int) (byte) 10, "", (double) '4');
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        double double6 = product3.getPrice();
        double double7 = product3.getPrice();
        int int8 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        model.Product product3 = new model.Product(52, "", (double) 100);
        double double4 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        model.Product product3 = new model.Product((int) 'a', "hi!", (double) (short) 10);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        model.Product product3 = new model.Product((int) (byte) 1, "", (double) (byte) -1);
        int int4 = product3.getId();
        int int5 = product3.getId();
        double double6 = product3.getPrice();
        java.lang.String str7 = product3.getName();
        java.lang.String str8 = product3.getName();
        java.lang.String str9 = product3.getName();
        int int10 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        model.Product product3 = new model.Product(10, "", (double) (byte) 100);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        java.lang.String str6 = product3.getName();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        java.lang.Class<?> wildcardClass9 = product3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        model.Product product3 = new model.Product(100, "hi!", (double) 0.0f);
        int int4 = product3.getId();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        model.Product product3 = new model.Product((int) ' ', "", (double) 52);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        int int6 = product3.getId();
        int int7 = product3.getId();
        double double8 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        model.Product product3 = new model.Product(52, "hi!", 0.0d);
        int int4 = product3.getId();
        java.lang.Class<?> wildcardClass5 = product3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        model.Product product3 = new model.Product(35, "", (double) 10L);
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
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        model.Product product3 = new model.Product((int) (short) 1, "hi!", (double) 100.0f);
        int int4 = product3.getId();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        model.Product product3 = new model.Product(0, "hi!", (double) (byte) 10);
        double double4 = product3.getPrice();
        int int5 = product3.getId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        model.Product product3 = new model.Product(0, "", (double) 100);
        java.lang.String str4 = product3.getName();
        double double5 = product3.getPrice();
        java.lang.String str6 = product3.getName();
        java.lang.String str7 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        model.Product product3 = new model.Product((int) (short) 0, "hi!", (double) (byte) -1);
        int int4 = product3.getId();
        double double5 = product3.getPrice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        model.Product product3 = new model.Product((int) ' ', "", (double) (byte) 1);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        model.Product product3 = new model.Product((int) (byte) 100, "hi!", (double) (short) 1);
        java.lang.String str4 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        model.Product product3 = new model.Product((-1), "hi!", 35.0d);
        java.lang.String str4 = product3.getName();
        java.lang.String str5 = product3.getName();
        java.lang.String str6 = product3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }
}

