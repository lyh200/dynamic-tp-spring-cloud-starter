package io.lyh.dtp.common.em;

import lombok.Getter;

/**
 * ConfigFileTypeEnum related
 *
 * @author: yanhom1314@gmail.com
 * @date: 2021-12-30 14:08
 * @since 1.0.0
 **/
@Getter
public enum ConfigFileTypeEnum {

    /**
     * config file type
     */
    PROPERTIES("properties"),
    XML("xml"),
    JSON("json"),
    YML("yml"),
    YAML("yaml"),
    TXT("txt");

    private final String value;

    ConfigFileTypeEnum(String value) {
        this.value = value;
    }

    public static ConfigFileTypeEnum of(String value) {
        for (ConfigFileTypeEnum typeEnum : ConfigFileTypeEnum.values()) {
            if (typeEnum.value.equals(value)) {
                return typeEnum;
            }
        }
        return PROPERTIES;
    }
}
