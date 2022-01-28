package ca.tetervak.kittymail.converter;

import ca.tetervak.kittymail.domain.CatMessage;
import org.springframework.core.convert.converter.Converter;

public class StringToCatMessageConverter implements Converter<String, CatMessage> {
    @Override
    public CatMessage convert(String source) {
        return CatMessage.valueOf(source.toUpperCase());
    }
}
