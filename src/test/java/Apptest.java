
import com.example.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Apptest {

    @Test
    @DisplayName("1+2 = 3")
    void t1(){
        App app =new App();
        int rst=app.plus(1,2);
        assertThat(rst).isEqualTo(3);
    }

}
