package com.ramonferreira.redirectUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UrlData {
  private String originalUrl;
  private Long expirationTime;
}
