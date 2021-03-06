package com.wuda.foundation.lang;

/**
 * 用于描述Code,这些Code在同一个{@link UniqueCodeDescriptorSchema}下必须唯一.
 * 每个子类如果想被查找到,必须调用{@link UniqueCodeDescriptorRegistry#register}方法把自己注册到{@link UniqueCodeDescriptorRegistry}
 * 中,这样就可以使用{@link UniqueCodeDescriptorRegistry#lookup(Class, Object)}方法
 * 查找了,可以在构造方法中就调用{@link UniqueCodeDescriptorRegistry#register}方法完成注册.
 *
 * @param <T> code的数据类型
 * @author wuda
 * @since 1.0.0
 */
public interface UniqueCodeDescriptor<T> {

    /**
     * 获取该code所在的schema,不需要{@link Schema}的实例,
     * 只需要schema的{@link Class}即可,表示是这一种的{@link UniqueCodeDescriptor}.
     *
     * @return class of schema
     */
    Class<? extends Schema> getSchemaClass();

    /**
     * 获取code值.
     *
     * @return code值
     */
    T getCode();

    /**
     * 获取该code的描述信息.
     *
     * @return 描述信息
     */
    String getDescription();

    /**
     * {@link UniqueCodeDescriptor}所在的schema.
     * 该类更多的只是一个占位符的作用,使用该类的{@link #getClass()}表示
     * 这一种schema即可.
     *
     * @author wuda
     * @since 1.0.0
     */
    interface Schema {

    }
}
