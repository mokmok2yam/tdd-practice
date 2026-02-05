import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RqTest {
    @Test
    @DisplayName(value="rq.getActionName()")
    void t1(){
        Rq rq =new Rq("삭제=?id=1");
        String actionName=rq.getActionName();
        Assertions.assertThat(actionName).isEqualTo("삭제");
    }

}
