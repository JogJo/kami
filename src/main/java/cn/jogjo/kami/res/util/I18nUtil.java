package cn.jogjo.kami.res.util;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Locale;

/**
 * 多语言工具类
 * <p>
 * PS：多语言的实际场景一般都是前端根据code直接转换显示，无需额外消耗服务端资源
 *
 * @author JogJo
 * @since 2025-03-08 09:03:33
 */
@Component
@RequiredArgsConstructor
public class I18nUtil {

    private final MessageSource messageSource;

    /**
     * 根据code获取对应的文本
     * resource/i18n中messages_xxx.properties的 code=文本
     *
     * @param code 多语言标记
     * @author JogJo
     */
    public String getMessage(String code) {
        if (!StringUtils.hasText(code)) {
            return "";
        }
        //获取当前线程的语言标识
        Locale locale = LocaleContextHolder.getLocale();

        //可以在前端请求的Header中获取，request.getHeader(Accept-Language)或Locale requestLocale =request.getLocale();一般不用额外处理
        //locale = Locale.US;
        //locale = Locale.SIMPLIFIED_CHINESE;

        return messageSource.getMessage(code, null, locale);
    }
}
