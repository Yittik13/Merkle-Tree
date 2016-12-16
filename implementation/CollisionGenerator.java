package merkle.implementation;

import merkle.Configuration;
import merkle.ICollisionGenerator;
import merkle.IMerkleTree;

import java.io.*;
import java.util.Arrays;

/**
 * TASK 4 BONUS
 * THIS IS FOR BONUS POINTS
 * DO NOT DO THIS BEFORE COMPLETING EVERYTHING ELSE FIRST
 * TODO: IMPLEMENT generateCollision
 *
 * @author Joel Uban
 * @pso 17
 * @date October 29, 2016
 *
 * Collaborators: Jun Soo Kim, Elvin Uthuppan
 */

public class CollisionGenerator extends ICollisionGenerator {

    /**
     * Given a <i>merkleTree</i> this function needs to
     * generate a file which will generate the merkleTree
     * The file then has to be dumped to <i>outputFile</i>
     * Basic code for writing blocks to a file is provided.
     */
    @Override
    public void generateCollision(File outputFile, IMerkleTree merkleTree) throws Exception {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {
            byte[] bytes = new byte[Configuration.blockSize];
            //TODO:implement

            int numLeaves;
            int position = merkleTree.getTree().length - 1;
            int i;
            int j;

            int quotient;

            if (merkleTree.getTree().length % 2 == 0) {
                numLeaves = merkleTree.getTree().length / 2;
            }
            else {
                numLeaves = (merkleTree.getTree().length / 2) + 1;
            }

            MerkleTree.Node[] leaves = new MerkleTree.Node[numLeaves];

            for (i = 0; i < numLeaves; i++) {
                leaves[i] = merkleTree.getNode(position--);
            }

            for (j = 0; j < numLeaves; j++) {
                //System.out.println("\nLeaf: " + leaves[j]);

                quotient = Integer.valueOf(leaves[j].getHash()) / 127;

                int num = quotient * 127;
                int other = Integer.valueOf(leaves[j].getHash()) - num;

                //System.out.println("quotient: " + quotient);
                //System.out.println("num: " + num);
                //System.out.println("other: " + other);

                String spf = "";

                for (i = 0; i < quotient; i++) {
                    spf += (char) 127;
                }
                spf += (char) other;

                for (i = spf.length(); i < 1024; i++) {
                    spf += '\0';
                }

                //System.out.println("spf: " + spf);

                bytes = spf.getBytes();

                bufferedOutputStream.write(bytes);
                bufferedOutputStream.flush();
            }
        }
    }
/*
    public static void main(String[] args) {
        MerkleTree m = new MerkleTree();
        CollisionGenerator c = new CollisionGenerator();

        try {
            File file = new File("project_3_data/md5.txt");
            File ofile = new File("project_3_data/output.txt");
            String hash = m.buildSumHash(file);

            c.generateCollision(ofile, m);

            String spoofedHash = m.buildSumHash(ofile);

            System.out.println("\nOriginal hash: " + hash);
            System.out.println("Spoofed hash: " + spoofedHash);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
}
