package step1;

import org.junit.jupiter.api.Test;
import step1.common.StringUtils;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringUtilsTest {

    @Test
    void 공백으로_나누는_문자열_가공(){
        String str = "1 + 9";

        List<String> split = StringUtils.split(str, " ");

        assertThat(split.size()).isEqualTo(3);
        assertThat(split.get(0)).isEqualTo("1");
        assertThat(split.get(1)).isEqualTo("+");
        assertThat(split.get(2)).isEqualTo("9");
    }

}
