
package second;


    
    public class ArrayOutOfBoundsExample {
        
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // مصفوفة تحتوي على 5 عناصر

        // محاولة للوصول إلى فهرس قد يكون خارج الحدود
        try {
            // قد يكون هذا الوصول خارج الحدود، حسب قيمة الفهرس
            int index = 10; // تعيين الفهرس إلى قيمة خارج الحدود كعينة
            System.out.println("Accessing number: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // التقاط الاستثناء وطباعة رسالة الخطأ
            System.out.println("لا تحاول هجمات تجاوز السعة في Java!");
        }
    }
}

    

