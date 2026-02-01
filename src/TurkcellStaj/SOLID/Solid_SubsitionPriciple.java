package TurkcellStaj.SOLID;

public class Solid_SubsitionPriciple {

    class Bird {
        void fly() {}
    }

    class Penguin extends Bird {
        @Override
        void fly() {
            throw new RuntimeException("Uçamam!");
        }
    }


    // Dogru tasarım penguin bird tam karşılayamadı



    interface Flyable {
        void fly();
    }

    class Sparrow implements Flyable {
        public void fly() { }
    }

    class Penguin1 {
        // uçma yok
    }

}
