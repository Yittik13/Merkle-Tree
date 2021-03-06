package merkle.implementation;

import merkle.Configuration;
import merkle.IMerkleTree;

import java.io.*;

import static merkle.Configuration.blockSize;
import static merkle.Configuration.hashFunction;

/**
 * TASK 1
 * TODO: IMPLEMENT build
 *
 * @author Joel Uban
 * @pso 17
 * @date October 18, 2016
 */
public class MerkleTree extends IMerkleTree {


    /**
     * Given an <i>inputFile</i> this function builds a Merkle Tree and return the <i>masterHash</i>
     * <i>this.tree</i> is the array representation of the tree which you need to create
     * You can use <i>Configuration.hashFunction</i>
     * The basic code to read a file block wise is provided. You can choose to use it.
     * The tree should be 1-indexed
     */
    @Override
    public String build(File inputFile) throws Exception {
        int blocks = (int) Math.ceil((double) inputFile.length() / Configuration.blockSize);

        System.out.println("File length: " + inputFile.length());
        System.out.println("Blocks: " + blocks);

        tree = new Node[blocks * 2];//Initialize this with a proper size
        tree[0] = new Node("dummy", 0);//Zeroth dummy node

        int position = blocks; //starting position in tree
        Node node;

        System.out.println("Tree size: " + tree.length);

        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(inputFile))) {
            byte[] byteArray = new byte[blockSize];
            int readStatus;

            while ((readStatus = reader.read(byteArray)) != -1) {
                String block = padBytes(byteArray, readStatus);


                String hash = Configuration.hashFunction.hashBlock(block);
                node = new Node(hash, position);
                tree[position] = node;
                position++;

                //TODO:implement

            }

            position = blocks;

            buildLayers(position, tree.length, tree);

            //printTree(tree);
        }

        System.out.println("\nTREE BUILT\n");

        //noinspection UnnecessaryLocalVariable
        String masterHash = tree[1].getHash();//to initialize
        return masterHash;
    }

    private static void buildLayers(int start, int end, Node[] tree) {
        int min = start;
        int max = start;

        if (start == 1) {
            return;
        }

        try {
            while (start < end) {
                Node node;
                if (start % 2 == 0) {
                    String hash = Configuration.hashFunction.concatenateHash(tree[start], tree[start + 1]);
                    int index = start / 2;
                    if (index < min) {
                        min = index;
                    }
                    if (index > max) {
                        max = index;
                    }
                    node = new Node(hash, index);
                    tree[index] = node;
                    start = start + 2;
                } else {
                    start++;
                }
            }
            buildLayers(min, max, tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String buildSumHash(File inputFile) throws Exception {
        SumHash sh = new SumHash();

        int blocks = (int) Math.ceil((double) inputFile.length() / Configuration.blockSize);

        System.out.println("File length: " + inputFile.length());
        System.out.println("Blocks: " + blocks);

        tree = new Node[blocks * 2];//Initialize this with a proper size
        tree[0] = new Node("dummy", 0);//Zeroth dummy node

        int position = blocks; //starting position in tree
        Node node;

        System.out.println("Tree size: " + tree.length);

        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(inputFile))) {
            byte[] byteArray = new byte[blockSize];
            int readStatus;

            while ((readStatus = reader.read(byteArray)) != -1) {
                String block = padBytes(byteArray, readStatus);


                String hash = sh.hashBlock(block);
                node = new Node(hash, position);
                tree[position] = node;
                position++;

                //TODO:implement

            }

            position = blocks;

            buildLayersSumHash(position, tree.length, tree);

            //printTree(tree);

        }

        //noinspection UnnecessaryLocalVariable
        String masterHash = tree[1].getHash();//to initialize
        return masterHash;
    }

    private static void buildLayersSumHash(int start, int end, Node[] tree) {
        SumHash sh = new SumHash();
        int min = start;
        int max = start;

        if (start == 1) {
            return;
        }

        try {
            while (start < end) {
                Node node;
                if (start % 2 == 0) {
                    String hash = sh.concatenateHash(tree[start], tree[start + 1]);
                    int index = start / 2;
                    if (index < min) {
                        min = index;
                    }
                    if (index > max) {
                        max = index;
                    }
                    node = new Node(hash, index);
                    tree[index] = node;
                    start = start + 2;
                } else {
                    start++;
                }
            }
            buildLayersSumHash(min, max, tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printTree(Node[] tree) {
        System.out.println("\nMERKLE TREE");
        for (int i = 0; i < tree.length; i++) {
            System.out.println(i + ": " + tree[i]);
        }
    }
}
