package java_proof.java_proof.passbyvalue;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ReferenceTest {

    // Bu metod referansı değiştirmeye çalışır
    public void changeReference(Dog dog) {
        //ilk referans degeri
        System.out.println(dog);
        // Yeni bir Dog objesi oluşturuyor ve yerel 'dog' referansını ona işaret ediyor
        dog = new Dog("Yeni Köpek");
        //referans degisti
        System.out.println(dog);

    }

    // Bu metod Dog nesnesinin adını değiştirir
    public void changeName(Dog dog) {
        // Parametre olarak gelen dog objesinin adı değiştirilir
        dog.setName("Rex");
    }


   //@PostConstruct
    public void initial(){
       // Yeni bir Dog nesnesi oluşturuluyor
       Dog myDog = new Dog("Fido");
       // İlk durumu yazdırıyoruz
       System.out.println("Başlangıçta: " + myDog.getName());  // Çıktı: Fido

       ReferenceTest test = new ReferenceTest();


       // Referansı değiştirmeye çalışıyoruz
       test.changeReference(myDog);
       // Referans değişmedi, hala aynı nesne
       System.out.println("changeReference'tan sonra: " + myDog.getName());  // Çıktı: Fido
       //ilk referans degeri
       System.out.println(myDog);


       // Şimdi Dog nesnesinin adını değiştiriyoruz
       test.changeName(myDog);
       // Ad değişti, çünkü aynı nesneye işaret ediyor
       System.out.println("changeName'den sonra: " + myDog.getName());  // Çıktı: Rex
   }


}
