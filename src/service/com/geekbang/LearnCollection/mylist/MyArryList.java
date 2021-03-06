package service.com.geekbang.LearnCollection.mylist;

import java.util.*;

public class MyArryList implements List {

        private Object[] elements;
        private int curr;

        public MyArryList() {
                elements =new Object[16];
                curr = 0;
        }

        @Override
        public List subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException();
        }


        @Override
        public int size() {
                return curr;
        }

        @Override
        public boolean isEmpty() {
                return curr == 0;
        }

        @Override//某个元素的存在
        public boolean contains(Object o) {
                for (Object ele : elements) {
                        if (Objects.equals(ele, o)) {
                                return true;
                        }
                }
                return false;
        }

        @Override
        public Iterator iterator() {
                return new Iterator() {
                        int pointer=0;

                        @Override
                        public boolean hasNext() {
                                return pointer<size();
                        }

                        @Override
                        public Object next() {
                                return elements[pointer++];
                        }
                };
        }

        @Override
        public Object[] toArray() {
                throw new UnsupportedOperationException();

        }

        @Override
        public Object[] toArray(Object[] a) {
                throw new UnsupportedOperationException();
        }


        @Override
        public boolean add(Object o) {
                if (curr == elements.length - 1) {
                        Object[] tem =new Object[elements.length * 2];
                        System.arraycopy(elements, 0, tem, 0, elements.length);
                        elements =tem;
                }
                elements[curr] = o;
                curr++;
                return true;
        }

        @Override
        public boolean remove(Object o) {
                throw new UnsupportedOperationException();

        }

        @Override
        public boolean containsAll(Collection c) {
                throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection c) {
                throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(int index, Collection c) {
                throw new UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(Collection c) {
                throw new UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(Collection c) {
                throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
                curr = 0;
        }

        @Override
        public Object get(int index) {
                if (index > curr || index < 0) {
                        throw new IndexOutOfBoundsException("out of boud" + curr + "for" + index);
                }
                return elements[index];
        }



        @Override
        public Object set(int index, Object element) {
                throw new UnsupportedOperationException();
        }

        @Override
        public void add(int index, Object element) {
                throw new UnsupportedOperationException();
        }

        @Override
        public Object remove(int index) {
                throw new UnsupportedOperationException();
        }

        @Override
        public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException();
        }

        @Override
        public int indexOf(Object o) {
                throw new UnsupportedOperationException();
        }

        @Override
        public ListIterator listIterator(int index) {
                throw new UnsupportedOperationException();
        }

        @Override
        public ListIterator listIterator() {
                throw new UnsupportedOperationException();
        }
}

