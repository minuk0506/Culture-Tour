# 개인 프로젝트

## 광주 문화-예술-관광-체육 시설 안내

### 0818-3:33 기준

- API 불러오기중
- 자바 Tour 일단완료
- SubwayEvent 진행중

### 이제는 쓰지 않는 SubwayeventApi 에서 문제 발생

- RestTemplate 로 데이터를 불러올때 302 인 경우 해당페이지로 리다이렉트 되지 않는다.
- 해당페이지를 리다이렉트 시키기 위해 Apache HttpClient 와 아래 코드가 필요하다.

```
    HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
    CloseableHttpClient httpClient = HttpClientBuilder.create()
            .setRedirectStrategy(new LaxRedirectStrategy())
            .build();
    factory.setHttpClient(httpClient);
    restTemp.setRequestFactory(factory);
```
