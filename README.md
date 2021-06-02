# Weld exclude test

## 正常系テスト

```
gradle test
```

## kennel/src/main/resources/META-INF/beans.xmlをリネームしてテストを失敗させる

```
cd kennel/src/main/resources/META-INF
mv beans.xml beans.xml.org
mv beans.xml.alt beans.xml
cd ../../../..
gradle test
```

## petshop/src/test/resources/META-INF/beans.xml.altをリネームしてテストの失敗が解消しないことを確認

```
cd petshop/src/test/resources/META-INF
mv beans.xml.alt beans.xml
cd ../../../..
gradle test
```
