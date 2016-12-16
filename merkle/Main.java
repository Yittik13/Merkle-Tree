package merkle;

import merkle.implementation.Client;
import merkle.implementation.MerkleTree;
import merkle.implementation.Server;

import java.io.*;
import java.util.List;

/**
 * Class:
 * Created by joeluban on 10/18/16.
 */
public class Main {
    int passed = 0;
    int failed = 0;

    public String test1() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "f77d283bc4dc37e72dc0e9a8f2e95fbd";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 1 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 1 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test2() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "123fe15277d6dae1a98ca2a1c36ab8b0";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 2 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 2 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test3() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "0b05bffc09bd9586ace82d6f6dfbc2e0";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 3 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 3 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test4() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "a1cd515d7886e1ce074c4f3fe76da746";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 4 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 4 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test5() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "3900749aa9e105e9c400b9d3218e043c";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 5 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 5 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test6() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            File file = new File("project_3_data/cryptographic_hash_function.txt");
            //File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "6f583c75f89af6f1a50923985cab541e";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 6 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 6 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test7() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            File file = new File("project_3_data/hash_function.txt");
            //File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "cd4c26222bff71b4a2027840526bc2bd";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 7 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 7 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test8() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            File file = new File("project_3_data/md5.txt");
            //File file = new File("project_3_data/Megabyte.data");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "f0da344365ad46e1cfa07a0f40e82946";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 8 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 8 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test9() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            File file = new File("project_3_data/megabyte.txt");
            //File file = new File("project_3_data/Merkle_tree.data");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "5f5b5fee53054973f33ed10fd1ef7dc7";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 9 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 9 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public String test10() {
        MerkleTree mt = new MerkleTree();
        String masterHash = null;

        try {
            //File file = new File("project_3_data/Cryptographic_hash_function.data");
            //File file = new File("project_3_data/Hash_function.data");
            //File file = new File("project_3_data/MD5.data");
            //File file = new File("project_3_data/Megabyte.data");
            File file = new File("project_3_data/merkle_tree.txt");
            //File file = new File("project_3_data/test.txt");

            masterHash = mt.build(file);
            String correctHash = "b77941b89ae80b9d38205a64e854a680";
            if (masterHash.equals(correctHash)) {
                System.out.println("TEST 10 PASSED");
                passed++;
            }
            else {
                System.out.println("TEST 10 FAILED");
                failed++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return masterHash;
    }

    public void testSumHash() {
        MerkleTree mt = new MerkleTree();
        File file1 = new File("project_3_data/cryptographic_hash_function.txt");
        File file2 = new File("project_3_data/hash_function.txt");
        File file3 = new File("project_3_data/md5.txt");
        File file4 = new File("project_3_data/megabyte.txt");
        File file5 = new File("project_3_data/merkle_tree.txt");

        String correctHash1 = "2474944";
        String correctHash2 = "3310328";
        String correctHash3 = "2511105";
        String correctHash4 = "53264";
        String correctHash5 = "919347";

        try {
            String hash1 = mt.buildSumHash(file1);
            String hash2 = mt.buildSumHash(file2);
            String hash3 = mt.buildSumHash(file3);
            String hash4 = mt.buildSumHash(file4);
            String hash5 = mt.buildSumHash(file5);

            System.out.println();
            System.out.println("Sum hash of file " + file1.getName() + ": " + hash1);
            System.out.println("Sum hash of file " + file2.getName() + ": " + hash2);
            System.out.println("Sum hash of file " + file3.getName() + ": " + hash3);
            System.out.println("Sum hash of file " + file4.getName() + ": " + hash4);
            System.out.println("Sum hash of file " + file5.getName() + ": " + hash5);

            if (!hash1.equals(correctHash1)) {
                System.out.println("Hash 1 does not match");
            }
            if (!hash2.equals(correctHash2)) {
                System.out.println("Hash 2 does not match");
            }
            if (!hash3.equals(correctHash3)) {
                System.out.println("Hash 3 does not match");
            }
            if (!hash4.equals(correctHash4)) {
                System.out.println("Hash 4 does not match");
            }
            if (!hash5.equals(correctHash5)) {
                System.out.println("Hash 5 does not match");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long testTime10MB() throws Exception {
        MerkleTree m = new MerkleTree();

        long startTime = System.currentTimeMillis();

        File tenMB = new File("project_3_data/10MB.data");

        m.build(tenMB);

        return System.currentTimeMillis() - startTime;
    }

    private static long testTime25MB() throws Exception {
        MerkleTree m = new MerkleTree();

        long startTime = System.currentTimeMillis();

        File tenMB = new File("project_3_data/25MB.data");

        m.build(tenMB);

        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        MerkleTree mt = new MerkleTree();
        Server s = new Server();
        IClient c = new Client();
        Main m = new Main();
        //m.testSumHash();

        try {
            //long time10MB = testTime10MB();
            Configuration.blockSize = 4096;
            long time25MB = testTime25MB();

            //System.out.printf("Time to build tree for 10MB file (block size: %d): %d\n", Configuration.blockSize, time10MB);
            System.out.printf("Time to build tree for 25MB file (block size: %d): %d\n", Configuration.blockSize, time25MB);
        } catch (Exception e) {
            e.printStackTrace();
        }



/*
        System.out.println("Master Hash: " + m.test1());
        System.out.println();
        System.out.println("Master Hash: " + m.test2());
        System.out.println();
        System.out.println("Master Hash: " + m.test3());
        System.out.println();
        System.out.println("Master Hash: " + m.test4());
        System.out.println();
        System.out.println("Master Hash: " + m.test5());
        System.out.println();
        System.out.println("Master Hash: " + m.test6());
        System.out.println();
        System.out.println("Master Hash: " + m.test7());
        System.out.println();
        System.out.println("Master Hash: " + m.test8());
        System.out.println();
        System.out.println("Master Hash: " + m.test9());
        System.out.println();
        System.out.println("Master Hash: " + m.test10());
        System.out.println();

        System.out.println("Passed: " + m.passed + "/" + (m.passed + m.failed));
        System.out.println("Failed: " + m.failed + "/" + (m.passed + m.failed));
*/
/*
        File file = new File("project_3_data/md5.txt");
        try {
            System.out.println();
            System.out.println("Master Hash: " + mt.buildSumHash(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
/*
        File file = new File("project_3_data/md5.txt");
        List<IMerkleTree.Node> list;

        try {
            s.uploadFile(file);
            mt.build(file);
            mt.printTree(mt.getTree());
            list = s.generateResponse(5);
            s.printList(list);
            c.uploadFile(file, s);
            System.out.println("\n" + c.verifyResponse(list));

        } catch (Exception e) {
            e.printStackTrace();
        }
*/
    }
}
