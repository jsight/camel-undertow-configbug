package com.configbug.configbug;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

@ConfigurationProperties(prefix="configclass")
public class ConfigClass {
  private String hello;
  private Set<String> args;

  public String getHello() {
    return hello;
  }

  public void setHello(String hello) {
    this.hello = hello;
  }

  public Set<String> getArgs() {
    return args;
  }

  public void setArgs(Set<String> args) {
    this.args = args;
  }
}

