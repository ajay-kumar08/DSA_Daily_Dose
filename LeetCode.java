import java.util.*;
public class LeetCode {
        //Problem No: 102 (Level Order Traversal of Binary Trees)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currlevel=new ArrayList<>();
            while(size-- >0){
                TreeNode curr=q.poll();
                currlevel.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);


            }
            ans.add(currlevel);

        }
        return ans;


    }







    //problem No: 1748
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();


        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }

        }
        int sum=0;
        for(int key: map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        System.out.println(sumOfUnique( nums));

    }
}
