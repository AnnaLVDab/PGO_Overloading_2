public class Address {
        public String kraj;
        public String miasto;
        public String kodPocztowy;
        public String nazwaUlicy;
        public String numerMieszkania;

        public Address(String kraj, String miasto, String kodPocztowy, String nazwaUlicy, String numerMieszkania) {
            this.kraj = kraj;
            this.miasto = miasto;
            this.kodPocztowy = kodPocztowy;
            this.nazwaUlicy = nazwaUlicy;
            this.numerMieszkania = numerMieszkania;
        }
        public String createAddress(String kraj) {
            return String.format("Kraj: %s", kraj);
        }
        public String createAddress(String kraj, String miasto) {
            return String.format("Kraj: %s, Miasto: %s", kraj, miasto);
        }
        public String createAddress(String kraj, String miasto, String kodPocztowy) {
            return String.format("Kraj: %s, Miasto: %s, Kod Pocztowy: %s", kraj, miasto, kodPocztowy);
        }
        public String createAddress(String kraj, String miasto, String kodPocztowy, String nazwaUlicy) {
            return String.format("Kraj: %s, Miasto: %s, Kod Pocztowy: %s, Ulica: %s", kraj, miasto, kodPocztowy, nazwaUlicy);
        }

        public String createAddress(String kraj, String miasto, String kodPocztowy, String nazwaUlicy, String numerMieszkania) {
            return String.format("Kraj: %s, Miasto: %s, Kod Pocztowy: %s, Ulica: %s, Mieszkanie: %s", kraj, miasto, kodPocztowy, nazwaUlicy, numerMieszkania);
        }

    }