package io.lyh.dtp.parser;

import io.lyh.dtp.common.em.ConfigFileTypeEnum;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * ConfigParser related
 *
 * @author: yanhom1314@gmail.com
 * @date: 2021-12-29 17:35
 * @since 1.0.0
 **/
public interface ConfigParser {

    /**
     * Judge type
     * @param type
     * @return
     */
    boolean supports(ConfigFileTypeEnum type);

    /**
     * type: yaml or properties
     * @return
     */
    List<ConfigFileTypeEnum> type();

    /**
     * Parse content
     * @param content
     * @return
     * @throws IOException
     */
    Map<Object, Object> doParse(String content) throws IOException;
}
