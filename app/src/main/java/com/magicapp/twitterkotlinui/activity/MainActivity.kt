package com.magicapp.twitterkotlinui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magicapp.twitterkotlinui.R
import com.magicapp.twitterkotlinui.adapter.FeedAdapter
import com.magicapp.twitterkotlinui.adapter.StoryAdapter
import com.magicapp.twitterkotlinui.model.Post
import com.magicapp.twitterkotlinui.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerFeed: RecyclerView
    lateinit var recyclerStory: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        recyclerStory = findViewById(R.id.recyclerStory)
        recyclerStory.setLayoutManager(
            LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false)
        )
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFeed.setLayoutManager(GridLayoutManager(this,1))

        refreshFeedAdapter(getAllFeeds())
        refreshStoryAdapter(getAllStories())
    }
    fun refreshStoryAdapter(chats: ArrayList<Story>){
        val adapter = StoryAdapter(this,chats)
        recyclerStory!!.adapter = adapter
    }
    fun refreshFeedAdapter(posts: ArrayList<Post>){
        val adapter = FeedAdapter(this,posts)
        recyclerFeed!!.adapter = adapter
    }
    fun getAllStories():ArrayList<Story>{
        val story: ArrayList<Story> = ArrayList()
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))
        story.add(Story(R.drawable.im_user_4, "Robert Downey Jr"))

        return story

    }

    fun getAllFeeds():ArrayList<Post>{
        val posts: ArrayList<Post> = ArrayList()
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))
        posts.add(Post(R.drawable.im_user_4, "PhotoGraph", R.drawable.camera_2))

        return posts

    }
}