package merkle.implementation;

import merkle.IMerkleTree;
import merkle.IServer;

import java.util.LinkedList;
import java.util.List;


/**
 * TASK 2
 * TODO: IMPLEMENT generateResponse
 *
 * @author Joel Uban
 * @pso 17
 * @date October 21, 2016
 */
public class Server extends IServer {

    /**
     * Given a node to verify identified by <i>blockToTest</i>
     * which corresponds to the node received by calling <i>merkleTree.getNode(blockToTest)</i>
     * this function generates the path siblings which are required for verification
     * The returned list should contains Nodes in order from node to the root, i.e. bottom up
     */
    public List<IMerkleTree.Node> generateResponse(int blockToTest) {
        List<IMerkleTree.Node> verificationList = new LinkedList<>();

        //TODO:implement

        int currentNode = blockToTest;

        verificationList.add(merkleTree.getNode(blockToTest)); //add first node

        while (currentNode > 1) {
            if (currentNode % 2 == 0) {
                verificationList.add(merkleTree.getNode(currentNode + 1));
            }
            else {
                verificationList.add(merkleTree.getNode(currentNode - 1));
            }
            currentNode /= 2;
        }

        return verificationList;
    }

    public void printList(List<IMerkleTree.Node> list) {
        int i;
        System.out.println("\nVERIFICATION LIST");
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
