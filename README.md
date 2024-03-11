# 1. StringBuffer 클래스 이용
String 클래스 대신 StringBuffer 클래스를 활용하 시간과 공간 낭비 줄일 수 있음
### insert() 메서드
```
StringBuffer stringBuffer = new StringBuffer("abcde");

System.out.println("원본 문자열: " + stringBuffer);
System.out.println(stringBuffer.insert(2, "123"));
System.out.println("insert() 메서드 호출 후 원본 문자열: " + stringBuffer);
```

### 실행 결과
```
원본 문자열: abcde
ab123cde
insert() 메서드 호출 후 원본 문자열: ab123cde
```

### delete() 메서드
```
StringBuffer stringBuffer = new StringBuffer("abcde");

System.out.println("원본 문자열: " + stringBuffer);
System.out.println(stringBuffer.delete(2, 4));
System.out.println(stringBuffer.deleteCharAt(1));
System.out.println("deleteCharAt() 메서드 호출 후 원본 문자열: " + stringBuffer);
```

### 실행 결과
```
원본 문자열: abcde
abe
ae
deleteCharAt() 메서드 호출 후 원본 문자열: ae
```

# 2. 시간 및 메모리 초과 상황
1) 입력 시, BufferedReader, StringTokenizer를 사용
2) 출력 시, BufferedWriter, StringBuilder를 사용

# 3. 중복 없이 특정 배열에 값 넣기
ArrayList를 선언하고, 특정 값이 value라고 가정
```
if (ArrayList.indexOf(value) < 0)
Arraylist.add(value);
```
indexOf는 특정 value가 없으면 -1을 리턴하기 때문에 ArrayList에 이 값이 없는 상황에만 add