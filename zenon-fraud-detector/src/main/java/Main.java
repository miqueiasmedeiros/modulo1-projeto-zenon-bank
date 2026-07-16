import java.math.BigDecimal;

public class Main {
    static void main() {

        Customer origin = new Customer(
                "C1231006815",
                BigDecimal.valueOf(170136.0),
                BigDecimal.valueOf(160296.36)

        );
        Customer destination = new Customer(
                "M1979787155",
                BigDecimal.ZERO,
                BigDecimal.ZERO
        );
        Transaction transaction = new Transaction(
                1,
                TransactionType.TRANSFER,
                BigDecimal.valueOf(9839.64),
                origin,
                destination,
                false,
                false
        );
        System.out.println(transaction);
    }
}
