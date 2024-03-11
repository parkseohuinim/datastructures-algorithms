package me.shplab.problemsolving.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Zoac4 {

    public static int solution(StringTokenizer st) throws IOException {
        int h = Integer.parseInt(st.nextToken()), // 행의 수
                w = Integer.parseInt(st.nextToken()), // 열의 수
                n = Integer.parseInt(st.nextToken()), // 세로 최소 거리
                m = Integer.parseInt(st.nextToken()); // 가로 최소 거리

        // 한 줄에 앉을 수 있는 참가자 수 계산
        int participantsPerRow = w / (m + 1);
        if (w % (m + 1) > 0) participantsPerRow++;

        // 전체 참가자 수 계산
        int totalParticipants = participantsPerRow * (h / (n + 1));
        if (h % (n + 1) > 0) totalParticipants += participantsPerRow;

        return totalParticipants;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

        bufferedWriter.write(String.valueOf(solution(st)));
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
