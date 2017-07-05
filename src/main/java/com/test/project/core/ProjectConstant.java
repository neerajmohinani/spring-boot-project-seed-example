package com.test.project.core;

/**
 * Project constants
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.test.project";// project-based package name, modified according to the company's own project

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";// model package
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";// Dao package
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//Service package
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//ServiceImpl package
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";//Controller package

}
