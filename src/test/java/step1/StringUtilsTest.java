package step1;

import org.junit.jupiter.api.Test;
import step1.common.StringUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringUtilsTest {

    @Test
    void 공백으로_나누는_문자열_가공(){
        String str = "1 + 9";

        String[] split = StringUtils.split(str, " ");

        assertThat(split.length).isEqualTo(3);
        assertThat(split[0]).isEqualTo("1");
        assertThat(split[1]).isEqualTo("+");
        assertThat(split[2]).isEqualTo("9");
    }

}
