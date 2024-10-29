

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class UserException extends RuntimeException{
    private StatusCode statusCode;
}
