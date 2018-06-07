package org.stepik.java.module3;

import java.util.Arrays;

public class Task3 {
    public class AsciiCharSequence implements CharSequence {

        private byte[] array;

        public AsciiCharSequence(byte[] array) {
            this.array = Arrays.copyOf(array, array.length);
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public char charAt(int index) {
            return (char) array[index];
        }

        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            byte[] temp = new byte[end - start];
            System.arraycopy(array, start, temp, 0, end - start);
            return new AsciiCharSequence(temp);
        }

        @Override
        public String toString() {
            return new String(array);
        }
    }
}
