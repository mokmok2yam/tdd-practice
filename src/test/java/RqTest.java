import com.example.Rq;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RqTest {
    @Test
    @DisplayName(value="rq.getActionName()=삭제")
    void t1(){
        Rq rq =new Rq("삭제?id=1");
        String actionName=rq.getActionName();
        Assertions.assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName(value="rq.getActionName()=수정")
    void t2(){
        Rq rq =new Rq("수정?id=1");
        String actionName=rq.getActionName();
        Assertions.assertThat(actionName).isEqualTo("수정");
    }

}
